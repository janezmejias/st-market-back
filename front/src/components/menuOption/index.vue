<template>
  <q-page class="q-pa-md">
    <q-breadcrumbs>
      <q-breadcrumbs-el to="/" label="Home" icon="home" />
      <q-breadcrumbs-el label="User" icon="redeem" />
    </q-breadcrumbs>

    <q-table
      style="margin-top: 2%"
      title="Treats"
      :data="list"
      :columns="columns"
      row-key="name"
      :filter="filter">

      <template v-slot:top-right>
        <q-input borderless dense debounce="300" v-model="filter" placeholder="Search">
          <template v-slot:append>
            <q-icon name="search" />
          </template>
        </q-input>
      </template>

      <template v-slot:body="props">
        <q-tr :props="props">                             
          <q-td key="name" :props="props">{{ props.row.name }}</q-td>          
          <q-td key="path" :props="props">{{ props.row.path }}</q-td>          
          <q-td key="id">
            <q-btn @click="edit(props.row.id)" outline round color="primary" icon="edit" style="margin-right: 5px !important"/>
            <q-btn @click="confirmRemove(props.row)" outline round color="primary" icon="delete" />
          </q-td>          
        </q-tr>
      </template>
    </q-table>

    <div class="absolute-bottom-right q-pa-md">
      <q-btn round to="/options/add" color="primary" icon="add">
        <q-tooltip
          transition-show="flip-right"
          transition-hide="flip-left"
          anchor="center left"
          self="center right"
        >Add Product</q-tooltip>
      </q-btn>
    </div>

    <q-dialog v-model="confirm" persistent>
      <q-card>
        <q-card-section class="row items-center">
          <q-avatar icon="help" text-color="dark" />
          <span class="q-ml-sm">¿Realmente desea eliminar este elemento?</span>
        </q-card-section>

        <q-card-actions align="right">
          <q-btn flat label="CancelAR" color="gray" v-close-popup />
          <!--<q-btn flat label="eliminar" color="red" v-close-popup />-->
          <q-btn @click="remove" color="red" text-color="white" label="Standard" />
        </q-card-actions>
      </q-card>
    </q-dialog>
  </q-page>
</template>

<script>
export default {
  // name: 'ComponentName',
  data() {
    return {
      confirm: false,
      filter: "",
      list: [],
      model: {},
      columns: [
        {
          name: "name",
          required: true,
          label: "Name (Short Product Name)",
          align: "left",
          field: row => row.name,
          format: val => `${val}`,
          sortable: true
        },
        {
          name: "path",
          align: "left",
          label: "URI",
          field: "path",
          sortable: true
        }
      ]
    };
  },
  mounted() {
    this.listAll();
  },
  methods: {
    listAll() {
      this.$axios.get("/options/listAll").then(response => {
        this.list = response.data;
      });
    },
    edit(id) {
      this.$router.push({
        path: "/options/edit/" + id,
        params: {
          id: id
        }
      });
    },
    confirmRemove(content) {
      this.model = content;
      this.confirm = true;
    },
    remove() {
      this.$axios
        .delete("/options/delete?id=" + this.model.id)
        .then(response => {
          this.listAll();
          this.confirm = false;
        });
    },
    roundValue(value) {
      return "$" + value.toFixed(2);
    }
  }
};
</script>

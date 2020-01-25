<template>
  <q-page class="q-pa-md">
    <q-breadcrumbs>
      <q-breadcrumbs-el to="/" label="Home" icon="home" />
      <q-breadcrumbs-el label="Edit Product" icon="redeem" />
    </q-breadcrumbs>

    <div class="row">
      <div class="col-12">
        <div class="q-pa-md">
          <div class="q-gutter-md">
            <q-input filled v-model="model.name" label="Name" />
          </div>
        </div>

        <div class="q-pa-md">
          <div class="q-gutter-md">
            <q-input filled v-model="model.title" label="Title" />
          </div>
        </div>

        <div class="q-pa-md">
          <div class="q-gutter-md">
            <q-input filled v-model="model.image" label="URL Image" />
          </div>
        </div>

        <div class="q-pa-md">
          <div class="q-gutter-md">
            <q-input filled v-model="model.oldPrice" label="Normal Price" />
          </div>
        </div>

        <div class="q-pa-md">
          <div class="q-gutter-md">
            <q-input filled v-model="model.newPrice" label="Off Price" />
          </div>
        </div>

        <div class="q-pa-md">
          <div class="q-gutter-md">
            <q-input filled v-model="model.discount" label="Discount" />
          </div>
        </div>

        <div class="q-pa-md">
          <div class="q-gutter-md">
            <q-input filled v-model="model.available" label="Available" />
          </div>
        </div>

        <div class="q-pa-md">
          <div class="q-gutter-md">
            <q-input filled v-model="model.description" label="Description" />
          </div>
        </div>
      </div>
    </div>

    <q-separator inset />

    <div class="q-pa-md q-gutter-sm">
      <q-btn @click="update" color="white" text-color="black" label="Save" />
      <q-btn @click="back" color="deep-orange" label="Cancel" />
    </div>
  </q-page>
</template>

<script>
export default {
  data() {
    return {
      model: {}
    };
  },
  mounted() {
    this.findBy(this.$route.params.id);
  },
  methods: {
    findBy(id) {
      this.$axios.get("/product/findBy?id=" + id).then(response => {
        this.model = response.data;
      });
    },
    update() {
      this.$axios.put("/product/update", this.model).then(response => {
        this.back();
      });
    },
    back() {
      this.$router.push("/items");
    }
  }
};
</script>

<template>
  <q-page class="q-pa-md">
    <q-breadcrumbs>
      <q-breadcrumbs-el to="/" label="Home" icon="home" />
      <q-breadcrumbs-el label="Add Product" icon="redeem" />
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
            <q-input filled v-model="model.path" label="Patch" />
          </div>
        </div>

        <div class="q-pa-md">
          <div class="q-gutter-md">
            <q-input filled v-model="model.image" label="URL Image" />
          </div>
        </div>

        <div class="q-pa-md">
          <div class="q-gutter-md">
            <q-toggle v-model="model.available" label="Is Available?" />
          </div>
        </div>

        <div class="q-pa-md">
          <div class="q-gutter-md">
            <q-toggle v-model="model.needToAuth" label="Need to Authenticate?" />
          </div>
        </div>
      </div>
    </div>

    <q-separator inset />

    <div class="q-pa-md q-gutter-sm">
      <q-btn @click="save" color="white" text-color="black" label="Save" />
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
      this.$axios.get("/options/findBy?id=" + id).then(response => {
        this.model = response.data;
      });
    },
    save() {
      this.$axios.put("/options/update", this.model).then(response => {
        this.back();
      });
    },
    back() {
      this.$router.push("/options");
    }
  }
};
</script>

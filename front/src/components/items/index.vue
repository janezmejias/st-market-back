<template>
<q-page class="q-pa-md">
    <q-breadcrumbs>
        <q-breadcrumbs-el to="/" label="Home" icon="home" />
        <q-breadcrumbs-el label="Items" icon="redeem" />
    </q-breadcrumbs>

    <div class="float-right">
        <q-btn round to="/item/add" color="primary" icon="add">
            <q-tooltip transition-show="flip-right" transition-hide="flip-left" anchor="center left" self="center right">
                Add Product
            </q-tooltip>
        </q-btn>

    </div>

    <div class="q-pa-md">

        <q-table :grid="$q.screen.xs" title="Treats" :data="list" :columns="columns" row-key="name" :filter="filter" hide-header>
            <template v-slot:top-right>
                <q-input borderless dense debounce="300" v-model="filter" placeholder="Search">
                    <template v-slot:append>
                        <q-icon name="search" />
                    </template>
                </q-input>
            </template>
        </q-table>
    </div>
</q-page>
</template>

<script>
export default {
    // name: 'ComponentName',
    data() {
        return {
            filter: '',
            list: [],
            columns: [{
                    name: 'name',
                    required: true,
                    label: 'Name (Short Product Name)',
                    align: 'left',
                    field: row => row.name,
                    format: val => `${val}`,
                    sortable: true
                },
                {
                    name: 'image',
                    align: 'center',
                    label: 'URL Image',
                    field: 'image',
                    sortable: true
                },
                {
                    name: 'oldPrice',
                    label: 'Normal Price',
                    field: 'oldPrice',
                    sortable: true,
                    sort: (a, b) => parseInt(a, 10) - parseInt(b, 10)
                },
                {
                    name: 'newPrice',
                    label: 'Off Price',
                    field: 'newPrice',
                    sortable: true,
                    sort: (a, b) => parseInt(a, 10) - parseInt(b, 10)
                }
            ]
        }
    },
    mounted() {
        this.index()
        //this.$q.loadingBar.start()
        /*
        Loading.show({
            spinner: QSpinnerGears,
            message: 'Some important <b>process</b> is in progress.<br/><span>Hang on...</span>'
        })

        setTimeout(() => {
            Loading.hide()
        }, 1000)
        */
    },
    methods: {
        index() {
            this.$axios.get('/product/listAll')
                .then((response) => {
                    this.list = response.data
                    this.$q.loadingBar.stop()
                });
        }
    }
}
</script>

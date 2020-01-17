<template>
<q-page class="q-pa-md">
    <q-breadcrumbs>
        <q-breadcrumbs-el to="/" label="Home" icon="home" />
        <q-breadcrumbs-el label="Items" icon="redeem" />
    </q-breadcrumbs>
    <div class="q-pa-md">

        <q-table title="Treats" :data="list" :columns="columns" row-key="name" :filter="filter">

            <template v-slot:top-right>
                <q-input borderless dense debounce="300" v-model="filter" placeholder="Search">
                    <template v-slot:append>
                        <q-icon name="search" />
                    </template>
                </q-input>
            </template>

            <template v-slot:body="props">
                <q-tr :props="props">
                    <q-td key="name" :props="props">
                        {{ props.row.name }}
                    </q-td>
                    <q-td key="image" :props="props">
                        {{ props.row.image }}
                    </q-td>
                    <q-td key="oldPrice" :props="props">
                        {{ props.row.oldPrice }}
                    </q-td>
                    <q-td key="newPrice" :props="props">
                        {{ props.row.newPrice }}
                    </q-td>
                    <q-td>
                        <q-btn round @click="delete(props.row.id)" color="pink" icon="delete" />
                    </q-td>
                </q-tr>
            </template>
        </q-table>

        <div class="absolute-bottom-right q-pa-md">
            <q-btn round to="/item/add" color="primary" icon="add">
                <q-tooltip transition-show="flip-right" transition-hide="flip-left" anchor="center left" self="center right">
                    Add Product
                </q-tooltip>
            </q-btn>
        </div>
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
    },
    methods: {
        index() {
            this.$axios.get('/product/listAll')
                .then((response) => {
                    this.list = response.data
                });
        },
        delete(id) {      
            console.log(id)
            this.$axios.delete('/product/delete?id=' + id)
                .then((response) => {
                    this.list = response.data
                });
        }
    }
}
</script>

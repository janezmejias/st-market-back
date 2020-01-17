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
                        {{ roundValue(props.row.oldPrice) }}
                    </q-td>
                    <q-td key="newPrice" :props="props">                        
                        {{ roundValue(props.row.newPrice) }}
                    </q-td>
                    <q-td key="id">
                        <q-btn style="margin-right: 5px" round @click="edit(props.row.id)" color="orange" icon="edit" />
                        <q-btn round @click="confirmRemove(props.row)" color="pink" icon="delete" />
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
            filter: '',
            list: [],
            model: {},
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
        this.listAll()
    },
    methods: {
        listAll() {
            this.$axios.get('/product/listAll')
                .then((response) => {
                    this.list = response.data
                });
        },
        edit(id) {
            this.$router.push({
                path: '/item/edit/' + id,
                params: {
                    id: id
                }
            })
        },
        confirmRemove(content) {
            this.model = content
            this.confirm = true
        },
        remove() {
            this.$axios.delete('/product/delete?id=' + this.model.id)
                .then((response) => {
                    this.listAll()
                    this.confirm = false
                });
        },
        roundValue(value) {
             return '$' + value.toFixed(2); 
        }
    }
}
</script>

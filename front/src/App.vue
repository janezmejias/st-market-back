<template>
<div id="q-app">
    <template>
        <q-layout view="lHh Lpr lFf">
            <q-header elevated>
                <q-toolbar>
                    <q-btn flat dense round @click="leftDrawerOpen = !leftDrawerOpen" icon="menu" aria-label="Menu" />

                    <q-toolbar-title>
                        Market Management
                    </q-toolbar-title>

                    <div>Quasar v{{ $q.version }}</div>
                </q-toolbar>
            </q-header>

            <q-drawer v-model="leftDrawerOpen" show-if-above bordered>
                <q-list>
                    <q-item-label header>Essential Links</q-item-label>
                    <q-item to="/items" clickable>
                        <q-item-section avatar>
                            <q-icon name="redeem" />
                        </q-item-section>
                        <q-item-section>
                            <q-item-label>Products</q-item-label>
                            <q-item-label caption>Manage all products</q-item-label>
                        </q-item-section>
                    </q-item>
                    <q-item to="/users" clickable>
                        <q-item-section avatar>
                            <q-icon name="person" />
                        </q-item-section>
                        <q-item-section>
                            <q-item-label>Users</q-item-label>
                            <q-item-label caption>Manage all Users</q-item-label>
                        </q-item-section>
                    </q-item>
                    <q-item to="analytics" clickable>
                        <q-item-section avatar>
                            <q-icon name="pie_chart" />
                        </q-item-section>
                        <q-item-section>
                            <q-item-label>Analytics</q-item-label>
                            <q-item-label caption>Manage all Users</q-item-label>
                        </q-item-section>
                    </q-item>
                    <q-separator />
                    <q-item to="security" clickable>
                        <q-item-section avatar>
                            <q-icon name="security" />
                        </q-item-section>
                        <q-item-section>
                            <q-item-label>Security</q-item-label>
                            <q-item-label caption>Manage all Users</q-item-label>
                        </q-item-section>
                    </q-item>
                </q-list>
            </q-drawer>

            <q-page-container>
                <router-view />
            </q-page-container>
        </q-layout>
    </template>
</div>
</template>

<script>
export default {
    name: 'App',
    data() {
        return {
            leftDrawerOpen: false
        }
    }
}
</script>

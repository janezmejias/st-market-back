
const routes = [
  {
    path: '/',
    component: () => import('components/home/index.vue')
  },
  {
    path: '/items',
    component: () => import('components/items/index.vue')
  },
  {
    path: '/item/add',
    component: () => import('components/items/add.vue')
  },
  {
    path: '/users',
    component: () => import('components/users/index.vue')
  }
]

// Always leave this as last one
if (process.env.MODE !== 'ssr') {
  routes.push({
    path: '*',
    component: () => import('pages/Error404.vue')
  })
}

export default routes

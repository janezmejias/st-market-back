
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
    path: '/item/edit/:id',
    component: () => import('components/items/edit.vue')
  },
  {
    path: '/users',
    component: () => import('components/users/index.vue')
  },
  {
    path: '/options',
    component: () => import('components/menuOption/index.vue')
  },
  {
    path: '/options/add',
    component: () => import('components/menuOption/add.vue')
  },
  {
    path: '/options/edit/:id',
    component: () => import('components/menuOption/edit.vue')
  }
]

if (process.env.MODE !== 'ssr') {
  routes.push({
    path: '*',
    component: () => import('pages/Error404.vue')
  })
}

export default routes

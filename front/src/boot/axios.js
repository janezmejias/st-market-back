import Vue from 'vue'
import axios from 'axios'
import { Loading, QSpinnerGears } from 'quasar'

Vue.prototype.$axios = axios
axios.defaults.baseURL = 'http://192.168.0.28:8080/api/v1'
axios.interceptors.request.use(function (config) {

    Loading.show({
        spinner: QSpinnerGears,
        message: 'Some important <b>process</b> is in progress.<br/><span>Hang on...</span>'
    })
    /*
    const token = this.$store.state.token;
    if(token) {
        config.headers.Authorization = `Bearer ${token}`;
    }
    */
    return config;
}, function (err) {
    return Promise.reject(err);
});
axios.interceptors.response.use(function (response) {
    setTimeout(() => {
        Loading.hide()
    }, 100)
    return response;
}, function (error) {
    setTimeout(() => {
        Loading.hide()
    }, 100)
    const originalRequest = error.config;
    /*
    if (error.response.status === 401 && !originalRequest._retry) {

        originalRequest._retry = true;

        const refreshToken = window.localStorage.getItem('refreshToken');
        return axios.post('http://localhost:8000/auth/refresh', { refreshToken })
            .then(({ data }) => {
                window.localStorage.setItem('token', data.token);
                window.localStorage.setItem('refreshToken', data.refreshToken);
                axios.defaults.headers.common['Authorization'] = 'Bearer ' + data.token;
                originalRequest.headers['Authorization'] = 'Bearer ' + data.token;
                return axios(originalRequest);
            });
    }
    */
    return Promise.reject(error);
});

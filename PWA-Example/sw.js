importScripts('./node_modules/workbox-sw/build/importScripts/workbox-sw.dev.v2.1.2.js');

let staticAssets = [
    './',
    './styles.css',
    './app.js'
];

const wb = new WorkboxSW();

wb.precache(staticAssets);
wb.router.registerRoute('https://pwa-blog-api-example.herokuapp.com/blogs', wb.strategies.networkFirst());
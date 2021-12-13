const moment = require('moment')
const themeConfig = require('./config/theme')
module.exports = {
  port: 6480,
  base: '/qq/',
  head: [
    ['meta', { name: 'viewport', content: 'width=device-width,initial-scale=1,user-scalable=no' }],
    ['script', { src: 'https://cdn.zhenxin.xyz/static/js/autoGray.js' }],
    [
      'script',
      {},
      `
        var _hmt = _hmt || [];
        (function() {
          var hm = document.createElement("script");
          hm.src = "https://hm.baidu.com/hm.js?829d75a87e9e913a7b41d74e1d8fb76a";
          var s  = document.getElementsByTagName("script")[0];
          s.parentNode.insertBefore(hm, s);
        })();
      `
    ]
  ],
  title: 'QQ Official Bot SDK 使用文档',
  theme: 'reco',
  themeConfig,
  plugins: [
    [
      '@vuepress/last-updated',
      {
        transformer: (timestamp) => {
          return moment(timestamp).format('YYYY/MM/DD HH:mm:ss')
        }
      }
    ],
    [
      '@vuepress/pwa',
      {
        serviceWorker: true,
        updatePopup: {
          message: "发现新内容可用",
          buttonText: "刷新"
        }
      }
    ],
    '@vuepress-reco/vuepress-plugin-extract-code',
    'flexsearch-pro'
  ]
}

const sidebar = require('./sidebar')
module.exports = {
    noFoundPageByTencent: false,
    docsRepo: 'xiaoye-bot/sdk-docs',
    docsDir: 'qq',
    docsBranch: 'main',
    editLinks: true,
    record: '辽ICP备19016520号-3',
    recordLink: 'http://beian.miit.gov.cn/',
    startYear: '2021',
    sidebar: sidebar,
    subSidebar: 'auto',
    search: true,
    editLinkText: '帮助我们改善此页面',
    lastUpdated: '上次更新',
    nav: [
        { text: '首页', link: '/', icon: 'reco-home' },
        { text: '加入QQ频道', link: 'https://qun.qq.com/qqweb/qunpro/share?_wv=3&_wwv=128&inviteCode=GECpm&from=246610&biz=ka', icon: 'reco-qq' },
        { text: 'Github', link: 'https://github.com/xiaoye-bot/qq-official-bot-sdk', icon: 'reco-github' },
    ]
}
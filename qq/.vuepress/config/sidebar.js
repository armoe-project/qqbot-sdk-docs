module.exports = {
    '/v1/': [
        {
            title: '快速上手',
            collapsable: false,
            children: [
                '/v1/getting-started',
            ]
        },
        {
            title: 'API',
            collapsable: false,
            children: [
                '/v1/api/guild',
                '/v1/api/audio',
                '/v1/api/message',
                '/v1/api/role',
                '/v1/api/announces',
                '/v1/api/member',
                '/v1/api/user',
                '/v1/api/mute',
                '/v1/api/channel',
                '/v1/api/permission',
                '/v1/api/schedule',
            ]
        },
        {
            title: '事件',
            collapsable: false,
            children: [
                '/v1/event/',
                '/v1/event/list',
                '/v1/event/handler',
            ]
        },
        {
            title: '进阶',
            collapsable: false,
            children: [
                '/v1/advanced/template-builder'
            ]
        },
        {
            title: '实体类',
            collapsable: true,
            children: [
                '/v1/entity/guild',
                '/v1/entity/channel',
                '/v1/entity/user',
                '/v1/entity/member',
                '/v1/entity/role',
                '/v1/entity/role-list',
                '/v1/entity/announces',
                '/v1/entity/message',
                '/v1/entity/message-ark',
                '/v1/entity/message-ark-kv',
                '/v1/entity/message-ark-obj',
                '/v1/entity/message-ark-obj-kv',
                '/v1/entity/message-attachment',
                '/v1/entity/message-embed',
                '/v1/entity/message-embed-field',
            ]
        },
    ]
}
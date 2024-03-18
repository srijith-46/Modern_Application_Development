const webpush = require('web-push');

// VAPID - Voluntary Application Server Identification for Web Push
// VAPID keys should only be generated only once.
const vapidKeys =
{
publicKey: 'BLxj_l-a9LwPAn1JcLuzdCwB9-B7cT02qHU5eOrPo-2-Rr3w5-nIOfN60fxLvWKxC5JNqiAmjuWS_4ctpX-Xdwg',
privateKey: 'nHUVJxt7218TpyLQ9vnv13zlhqAeSuQqmvY4E6z_iqw'
}

webpush.setVapidDetails(
'mailto:deepikak@rvce.edu.in',
vapidKeys.publicKey,
vapidKeys.privateKey
);

// This is the same output of calling JSON.stringify on a PushSubscription
const pushSubscription = {
endpoint: '.....',
keys: {
auth: '.....',
p256dh: '.....'
}
};

webpush.sendNotification(pushSubscription, 'This is a web notification');

// webpush.generateVAPIDKeys();

// console.log(vapidKeys);
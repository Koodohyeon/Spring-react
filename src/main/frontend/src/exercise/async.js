function delay(ms) {
     return new Promise(resolver => setTimeout(resolver, ms));
}
   // setTimeout(() => {}, ms); 위에꺼

function getApple() {
    delay(3000);    // 시간이 소요되는 작업
    return '일찍 배달되는 사과';
}

async function getBanana() {
    await delay(3000);
    return '제때 찾아오는 바나나';
}


console.log(getApple());
// getApple()
//     .then(data => {console.log(data);});
getBanana()
    .then(data => {console.log(data);});
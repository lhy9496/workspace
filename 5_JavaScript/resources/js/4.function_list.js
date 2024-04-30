let members = [
    'Ace',
    'Bella',
    'Charles',
    'Daivd',
    'Eva'
]

//push
console.log(members.push('Flora'));
console.log(members);

//splice()
console.log(members.splice(0,3));

//concat
console.log(members.concat('Grace'));
console.log(members);

members = [
    'Ace',
    'Bella',
    'Charles',
    'Daivd',
    'Eva'
]

let members2 = [
    ...members
]

console.log(members2);

console.log("---------------------------------------------")

let memberInfo = {
    name: "Harold",
    age: 47,
    gender : 'M'
}

let memberInfo2 = {
    ...memberInfo,
    age : 12
}

console.log(memberInfo2);

console.log("---------------------------------------------")

//join()
console.log(members2.join());
console.log(members2.join('/'));
console.log(members2.join(' '));

//sort()
members2.sort();
console.log(members2);
console.log(members2.reverse());

let numbers = [ 1, 9, 7, 5, 3]
console.log(numbers);

//a, b를 비교한다.
//1) a를 b보다 나중에 정렬하고 싶다면(= 뒤에 두고 싶다면) 0보다 큰 수를 반환
//2) a를 b보다 먼저 정렬하고 싶다면(= 앞에 두고 싶다면) 0보다 작은 수를 반환
//3) 원래 순서를 유지하고 싶다면 0을 반환한다.
numbers.sort((a, b) => {
    //console.log(a + " : " + b);
    // return a > b ? 1: -1; // 오름차순 정렬
    return a > b ? -1: 1;
});

numbers.sort((a, b) => a > b ? 1: -1);

console.log(numbers);

console.log("---------------------------------------------")

//map
//기존 배열의 요소를 전부 반복하면서
//return된 값으로 새로운 배열을 만들어주는 함수
// console.log(members2.map((m => 
//     for(let m of members2){
//         if(m.length > 3){
//             return m + "[vip]";
//         }else{
//             return m + "[gold]";
//         }
//     }
// )))

// console.log(members2);
// =>
// let tmpMembers = [];
// for(let m of members2){
//     tmpMembers.push(m + 1);
// }

//filter()

let numbers2 = [1, 8, 7, 6, 3];
let tmp2 = [];
for (let n of numbers2){
    if(n % 2 ===0){
        tmp2.push(n);
    }
}

tmp2 = numbers2.filter(n => n % 2 === 0);
console.log(numbers2.filter(n => n % 2 === 0));

//find()
console.log(tmp2.find(n => n % 2 === 1));

//findIndex()
console.log(numbers2)
console.log(numbers2.findIndex(n => n % 2 === 0));

//reduce
console.log(numbers2.reduce((p, n) => p + n, 0));
console.log(numbers2.reduce((sum, n) => {
    if(n % 2 === 1){
        sum.push(n);
    }
    return sum;
}, []))
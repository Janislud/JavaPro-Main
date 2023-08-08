// Написать функцию, вычисляющую сумму тех чисел в диапазоне от 1 до n, которые делятся на m.
// Решить задачу:
// а) через цикл
// б) через рекурсию

// а) через цикл
// function sum_between (n,m) {
//     let sum = 0
//         for (let i = 0; i <= n; i++) {
//             if(i % m === 0){
//                 sum += i
//             }
//         }
//         console.log(sum)
//      }
//      sum_between(10,5)
    
     //б) через рекурсию
    
    //  function summ_betweeen_rec(n,m,count = 1, sum =0) {
    //     if(count > n) return sum
    
    //     if (count % m ===0) {
    //         sum += count
    //     }
    //     return summ_betweeen_rec(n,m, count +1 , sum)
    //  }
    
    //  let result = summ_betweeen_rec(15,5)
    //  console.log(result)
    
// Вычислить n-й член последовательности, заданной формулами:
// a(2n) = a(n) + a(n-1),
// a(2n+1) = a(n) — a(n-1),
// a(0) = a(1) = 1.


// Т.е.:
// a(2) = a(1) + a(0) = 2
// a(3) = a(1) - a(0) = 0
// a(4) = a(2) + a(1) = 3
// a(5) = a(2) - a(1) = 1
// Решить задачу через рекурсию, и далее оптимизировать алгоритм методом мемоизации.

//  function sequence(n, sum = 0) {
//     if (sum > n) {
//       return sum;
//     }
  
//     if (n === 0 || n === 1) {
//       return 1;
//     } else if (n % 2 === 0) {
//       return sequence(n / 2, sum) + sequence(n / 2 - 1, sum);
//     } else {
//       return sequence((n - 1) / 2, sum) - sequence((n - 1) / 2 - 1, sum);
//     }
//   }
//   const memoized = sequence(110);
 
//   console.log(memoized);


  // -----------------------------


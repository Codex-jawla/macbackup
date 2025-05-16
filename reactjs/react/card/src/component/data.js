export const tabdata = {
  arrow: {
    title: "Arrow Function",
    discription:
      "An arrow function expression is a compact alternative to a traditional function expression, with some semantic differences and deliberate limitations in usage:",
      code: `const function_name = ()=>{
        // function body
    } `, 
  },
  func: {
    title: "Function",
    discription: "In JavaScript, functions are first-class objects, because they can be passed to other functions, returned from functions, and assigned to variables and properties.",
    code: `function function_name(){
        // function body
    } `,
  },
  object: {
    title: "Object",
    discription: "The Object type represents one of JavaScript's data types. It is used to store various keyed collections and more complex entities.",
    code: `const object_name = {
        key : value,
        key2 : value2,
    } `,
  },
  classes: {
    title: "Classes",
    discription: `ECMAScript 2015, also known as ES6, introduced JavaScript Classes.
            JavaScript Classes are templates for JavaScript Objects.`,
    code: `class Car {
        constructor(name, year) {
          this.name = name;
          this.year = year;
        }
      }
        const myCar1 = new Car("Ford", 2014);
        const myCar2 = new Car("Audi", 2019);
      `,
  },
};

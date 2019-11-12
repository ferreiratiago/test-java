import { A } from "moduleA"
import {SquareConfig} from "./b"
import { isExternalModuleNameRelative } from "typescript";

function createSquare(config: SquareConfig): { color: string; area: number } {
    let newSquare = {color: "white", area: 100};
    if (config.color) {    
        newSquare.color = config.color;
    }
    if (config.width) {
        newSquare.area = config.width * config.width;
    }    
    return newSquare;
}

// excess property checking 
let props = { colour: "red", width: 100 };
// Object literals get special treatment and undergo 
// excess property checking when assigning them to other variables, or passing them as arguments.
let mySquare = createSquare({ colour: "red", widthe: 100 } as SquareConfig);


interface SearchFunc {
    (source: string, subString: string): boolean;
}

let mySearch: SearchFunc;

mySearch = function(source: string, subString: string): boolean {
    let result = source.search(subString);
    return result > -1;
}

// Index types
interface StringArray {
    [index: number]: string;
}

let myArray: StringArray;
myArray = ["Bob", "Fred"];

let myStr: string = myArray[0];

class Animal {
    name: string;
}
class Dog extends Animal {
    breed: string;
}

// Error: indexing with a numeric string might get you a completely separate type of Animal!
interface NotOkay {
  //  [x: string]: Animal;
    [x: number]: Dog;
}

let dog: Dog = {name: "Albert", breed: "corgi"}
let notOkay: NotOkay;
notOkay = [dog]

//
interface NumberDictionary {
    [index: string]: number;
    length: number;    // ok, length is a number
    name: number;      // error, the type of 'name' is not a subtype of the indexer
}

let dic: NumberDictionary;
dic = {inde: 1, length: 10, name:1};


interface ClockInterface {
    currentTime: Date;
    setTime(d: Date): void;
}

class Clock implements ClockInterface {
    currentTime: Date = new Date();
    setTime(d: Date) {
        this.currentTime = d;
    }
    constructor(h: number, m: number) { }
}

let c = new Clock(1,1);

// Difference between the static and instance sides of classes
interface ClockConstructor {
    new (hour: number, minute: number);
}

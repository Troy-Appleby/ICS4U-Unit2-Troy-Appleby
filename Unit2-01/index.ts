/**
 * This class defines a string stack
 *
 * author  Troy Appleby
 * version 1.0
 * since   2024-03-22
 */
import { MrCoxallStack } from './MrCoxallStack'

let fruits = new MrCoxallStack()
fruits.push("apple")
fruits.push("banana")
fruits.push("cherry")
console.log("fruits: " + fruits.showStack())

let colours = new MrCoxallStack()
colours.push("red")
colours.push("green")
colours.push("blue")
console.log("colours: " + colours.showStack())

let dogs = new MrCoxallStack()
dogs.push("poodle")
dogs.push("retriever")
dogs.push("beagle")
console.log("dogs: " + dogs.showStack())

console.log("\nDone.")

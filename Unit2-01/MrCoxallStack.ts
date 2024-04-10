/**
 * The class defines a string stack
 *
 * author  Troy Appleby
 * version 1.0
 * since   2024-03-22
 */

export class MrCoxallStack {
  // strsstack: string[]

  // variables
  constructor() {
    this.stackAsList = []
  }

  // push item to end of list
  push(input) {
    this.stackAsList.push(input)
  }

  // show full stack seperated by commas
  showStack() {
    let values = ""
    for (let counter = 0; counter < this.stackAsList.length; counter++) {
      values = values + this.stackAsList[counter] + ", "
    }
    values = values.substring(0, values.length-2)
    return values
  }
}

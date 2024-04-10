/**
 * This class defines a string stack
 *
 * author  Troy Appleby
 * version 1.0
 * since   2024-03-25
 */

export class MrCoxallStack {

  /*
  * The constructor for the MrCoxallStack string stack class.
  */
  constructor() {
    this.stackAsList = []
  }

  /*
  * This method returns the stack as a string.
  */
  public get showStack() {
    let values = ""
    for (let counter = 0; counter < this.stackAsList.length; counter++) {
      values = values + this.stackAsList[counter] + ", "
    }
    values = values.substring(0, values.length-2)
    return values
  }

  /*
  * This method pushes a string onto the stack.
  */
  public push(input) {
    this.stackAsList.push(input)
  }

  /*
  * This method pops a string from the stack.
  */
  public popItem() {
    let poppedItem = ""
    if (this.stackAsList.length > 0) {
      poppedItem = this.stackAsList[this.stackAsList.length - 1]
    } else {
      poppedItem = "nothing to remove"
    }
    this.stackAsList.splice(-1)
    return poppedItem
  }
}

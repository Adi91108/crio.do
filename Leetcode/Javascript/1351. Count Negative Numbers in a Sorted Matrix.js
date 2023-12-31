/**
 * @param {number[][]} grid
 * @return {number}
 */
var countNegatives = function (grid) {
    let count = 0;
    // Iterate on all elements of the matrix one by one.
    grid.forEach(row => {
        row.forEach(element => {
            // If the current element is negative, we count it.
            if (element < 0) {
                count++;
            }
        });
    });
    return count;
};
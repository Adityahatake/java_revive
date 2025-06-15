#include <iostream>
#include <string>
using namespace std;

void printMatrix(string w1, string w2) {
    int row = -1, col = -1;

    // Find the last shared character (last occurrence)
    for (int i = w1.size() - 1; i >= 0; i--) {
        for (int j = w2.size() - 1; j >= 0; j--) {
            if (w1[i] == w2[j]) {
                col = i;
                row = j;
                goto found; // break both loops
            }
        }
    }

found:
    if (row == -1 || col == -1) {
        cout << "No shared letter found" << endl;
        return;
    }

    for (int i = 0; i < w2.size(); i++) {
        if (i == row) {
            cout << w1 << endl;
        } else {
            for (int j = 0; j < w1.size(); j++) {
                if (j == col) cout << w2[i];
                else cout << "_";
            }
            cout << endl;
        }
    }
}

int main() {
    string A, B;
    cin >> A >> B;
    printMatrix(A, B);
    return 0;
}

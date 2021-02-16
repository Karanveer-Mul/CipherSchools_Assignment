
int main() {
    int arr[] = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};

    int len = sizeof(arr)/ sizeof(arr[0]);

    int i = 0;
    int j = len - 1;
    while(i<j) {
        if(arr[i] == 0) {
            i++;
            continue;
        }
        if(arr[j] == 1) {
            j--;
            continue;
        }
        if(arr[i] == 1) {
            arr[j] = 1;
            arr[i]  = 0;
            i++;
            j--;
        }
    }

    for(i = 0; i<len; i++) {
        cout << arr[i] << " ";
    }

    return 0;
}

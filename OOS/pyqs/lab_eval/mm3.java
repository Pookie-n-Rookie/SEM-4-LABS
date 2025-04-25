import java.util.Scanner;

class MyThread extends Thread{
    static int n, e, targetLocation, targetThread = -1;
    static int arr[];
    int start, end, index;

    MyThread(int s, int e, int ind){
        start = s;
        end = e;
        index = ind;
    }

    static void setDetails(int size, int target, int array[]){
        arr = array;
        n = size;
        e = target;
    }

    void binarySearch(){
        int l = start, h = end, m;
        while(l<=h && targetThread == -1){
            m = (h+l)/2;
            if(arr[m] > e){
                h = m-1;
            }else if(arr[m] < e){
                l = m+1;
            }else{
                targetLocation = m;
                targetThread = index;
                break;
            }
        }
    }

    public void run(){
        binarySearch();
    }
}

class Demo{
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();

            if(n%10!=0){
                System.out.println("Size of array must be a multiple of 10");
                return;
            }

            int arr[] = new int[n];

            System.out.print("Enter array elements: ");
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter the target element: ");
            int e = sc.nextInt();

            MyThread.setDetails(n, e, arr);

            MyThread threads[] = new MyThread[n/10];

            for(int i=0;i<n/10;i++){
                threads[i] = new MyThread(i*10, (i+1)*10 -1, i+1);
                threads[i].start();
                threads[i].join();
            }

            System.out.println("Index: "+MyThread.targetLocation);
            System.out.println("Thread: "+MyThread.targetThread);

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}

package rvt;


// Always Reference data type
public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
    }

    public void addNumber(int number) {
        this.sum += number;
        // this.count++;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        return this.sum / (double) this.count;
    }
}

// public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         Statistics statistics = new Statistics();
//         Statistics evenStat = new Statistics();
//         Statistics oddStat = new Statistics();
//         // statistics.addNumber(3);
//         // statistics.addNumber(5);
//         // statistics.addNumber(1);
//         // statistics.addNumber(2);
        

//         System.out.println("Give me numbers: ");
//         while (true){
//             int number = Integer.valueOf(scanner.nextLine());
//             if (number == -1){
//                 break;
//             } else{
//                 statistics.addNumber(number);
//             }

//             if (number % 2 == 0){
//                 evenStat.addNumber(number);
//             }
//             else if (number % 2 != 0){
//                 oddStat.addNumber(number);
//             }
//         }
//         // System.out.println("Count: " + statistics.getCount());
//         System.out.println("Sum: " + statistics.sum());
//         // System.out.println("Average: " + statistics.average());
//         System.out.println("Sum of even number: " + evenStat.sum());
//         System.out.println("Sum of odd numbers: " + oddStat.sum());
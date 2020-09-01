public class Main {
    public static void main(String[]args) {
        Mentor femaleMentor = new Mentor(true, 12, "yes", "Yes,", "English");
        Student asianStudent = new Student("john", "Samuyiwa", 20, 1, 80, 12, false, "be a cool developer !");
        Mentor maleMentor = new Mentor(true, 8, "do better", "internet", "Russian and German");
        Student blackStudent = new Student("Sway", "lo", 19, 2, 70, 11, false, "impacting knowledge is my mission");
        Student russianStudent = new Student("Alexander", "Polatsky", 23, 4, 71, 11, false, "speaks russian language fluently and loves people");
        Student englishStudent = new Student("Rock", "Sawyer", 19, 1, 98, 14, true, "speaks english so good and friend with polatsky");
        System.out.println(asianStudent.toString());
        System.out.println(blackStudent.toString());
        System.out.println(russianStudent.toString());
        System.out.println(englishStudent.toString());
        System.out.println(femaleMentor.toString());
        System.out.println(maleMentor.toString());

        int i = 30;
        do {i--;} while (i > 0);
        System.out.println("Value i = " + i);
        Random random = new Random();
        random.nextInt(); //любое случайное число
        random.nextInt(5); //случайное число не больше 5
//Ниже показано, как сгенерировать случайное число в интервале от 100 до 200
        int min = 100;
        int max = 200;
        int diff = max - min;
        random.nextInt(diff + 1);
    }


    @Override
    public String toString() {
        return super.toString();
    }
}

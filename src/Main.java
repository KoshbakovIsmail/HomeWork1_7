import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int one = 1, ten = 10;
        int targetSumPer = 12_000_000, targetSum = 245_9000, monthlyBudget = 15000, month = 0, totalSum = 0;
        int population = 12_000_000, people = 1000, birthPeople = 17, deatPeople = 8;
        int totalBirthYears = population * (birthPeople - deatPeople) / people;
        int currentYear = 2023, yearsToCheck = 200, yearsToPredict = 100, cometPeriod = 79;
        int startYear = currentYear - yearsToCheck;
        int endYear = currentYear + yearsToPredict;
        int monthlyOneYear = 12, totalYear = 9, totalMothly = totalYear * monthlyOneYear;
        int halfYear = 6, zero = 0;
        double monthlyPercent = 0.07;

        HomeWork.test1(targetSum, monthlyBudget, month, totalSum);
        HomeWork.test2(one, ten);
        HomeWork.test3(population, totalBirthYears, one, ten);
        HomeWork.test4_5(targetSumPer, monthlyBudget, monthlyPercent, month, halfYear, zero);
        HomeWork.test6(targetSumPer, monthlyBudget, monthlyPercent, totalMothly, month, halfYear, zero);
        HomeWork.test7_1();
        HomeWork.test7_2();
        HomeWork.test8(cometPeriod, startYear, endYear);
    }
    public static class HomeWork {
        public static void test1(int targetSum, int monthlyBudget, int month, int totalSum) {
            System.out.println(" Задача№1");

            while (totalSum <= targetSum) {
                month++;
                totalSum += monthlyBudget;
                System.out.println("Месяц " + month + " Сумма накоплений равно " + totalSum + " рублей");
            }
        }
        public static void test2(int one, int ten) {
            System.out.println("  Задача№2");

            while (one <= ten) {
                System.out.print(one + " ");
                one++;
            }
            System.out.println();
            one = 1;
            for (int i = ten; i >= one; i--) {
                System.out.print(i + " ");
            }
        }
        public static void test3(int population, int totalBirthYears, int one, int ten) {
            System.out.println();
            System.out.println("  Задача№3");

            for (int year = one; year <= ten; year++) {
                population += totalBirthYears;
                System.out.println("год " + year + " Численность насиление составляет " + population);
            }
        }
        public static void test4_5(int targetSumPer, int monthlyBudget, double monthlyPercent, int month, int halfYear, int zero) {
            System.out.println("  Задача№4");

            while (monthlyBudget <= targetSumPer) {
                monthlyBudget += (int) (monthlyBudget * monthlyPercent);
                month++;
                System.out.println("Месяц " + month + " Сумма " + monthlyBudget);
            }
            System.out.println("  Задача№5");

            targetSumPer = 12_000_000;
            monthlyBudget = 15000;
            halfYear = 6;
            zero = 0;
            month = 0;
            monthlyPercent = 0.07;

            while (monthlyBudget <= targetSumPer) {
                monthlyBudget += (int) (monthlyBudget * monthlyPercent);
                month++;
                if (month % halfYear == zero) {
                    System.out.println("Месяц " + month + " Сумма " + monthlyBudget);
                }
            }
        }
        public static void test6(int targetSumPer, int monthlyBudget, double monthlyPercent, int totalMonthly, int month, int halfYear, int zero) {
            System.out.println("  Задача№6");

            while (month <= totalMonthly) {
                monthlyBudget += (int) (monthlyBudget * monthlyPercent);
                month++;
                if (month % halfYear == zero) {
                    System.out.println("Месяц " + month + " Сумма " + monthlyBudget);
                }
            }
        }
        public static void test7_1() {
            System.out.println("  Задача№7_1");

            int monthDay = 31, weekDay = 7, reportDay = 5;
            String nameDay = null;

            switch (reportDay) {
                case 5:
                    nameDay = "Пятница";
                    break;
            }
            for (int day = reportDay; day <= monthDay; day += weekDay) {
                System.out.println("Сегодня " + day + " чесло " + nameDay + " надо делать отчет!");
            }
        }
        public static void test7_2() {
            System.out.println("  Задача№7_2");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите количество дней в месяце : ");
            int mothDay = scanner.nextInt();
            System.out.println("Выберите день в неделе для отчета, от 1 до 7 : ");
            int reportDay = scanner.nextInt();
            int weekDay = 7;
            String nameDay = null;
            switch (reportDay) {
                case 1:
                    nameDay = "Понедельник";
                    break;
                case 2:
                    nameDay = "Вторник";
                    break;
                case 3:
                    nameDay = "Среда";
                    break;
                case 4:
                    nameDay = "Четверг";
                    break;
                case 5:
                    nameDay = "Пятница";
                    break;
                case 6:
                    nameDay = "Суббота";
                    break;
                case 7:
                    nameDay = "Воскресение";
                    break;
                default:
                    System.out.println("Ошибка! выберите от 1 до 7: ");
            }
            for (int day = reportDay; day <= mothDay; day += weekDay) {
                System.out.println("Сегодня " + day + " чесло " + nameDay + " надо здать отчет! ");
            }
        }
        public static void test8(int cometPeriot, int startYear, int endYear) {
            System.out.println("  Задача№8");

            for (int year = 0; year <= endYear; year += cometPeriot) {
                if (year > startYear) {
                    System.out.println(year);
                }
            }
        }
    }
}







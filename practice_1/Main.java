public class Main {
    public static void main(String[] args) {
        Company originals = new Company();
        for (int i = 0; i < 180 ; i++) {
            originals.hire(new Operator());
        }

        for (int i = 0; i < 80 ; i++) {
            originals.hire(new Manager());
        }

        for (int i = 0; i < 10 ; i++) {
            originals.hire(new TopManager());
        }

        System.out.println("Топ 15 самых высоких заработных: ");
        originals.getTopSalaryStaff(15);
        for (int i = 0; i < originals.topSalary.size(); i++) {
            System.out.println(originals.topSalary.get(i));
        }

        System.out.println("\nТоп 30 самых низких заработных: ");
        originals.getLowestSalaryStaff(30);
        for (int i = 0; i < originals.lowestSalary.size(); i++) {
            System.out.println(originals.lowestSalary.get(i));
        }


        System.out.println("\nПроизошло сокращение в компании.");
        System.out.println("Количество сотрудников до сокращения: " + originals.staff.size());
        int dismissal = originals.staff.size() / 2; // Пришлось добавить эту строку, потому что в цикле он не правильно
                                                    // считал. Получалось не ровно половина списка.

        for (int i = 0; i < dismissal ; i++) {
            originals.fire(originals.staff.get(i));
        }
        System.out.println("Количество сотрудников после сокращения: " + originals.staff.size());


        System.out.println("\nТоп 15 самых высоких заработных: ");
        for (int i = 0; i < originals.topSalary.size(); i++) {
            System.out.println(originals.topSalary.get(i));
        }

        System.out.println("\nТоп 30 самых низких заработных: ");
        for (int i = 0; i < originals.lowestSalary.size(); i++) {
            System.out.println(originals.lowestSalary.get(i));
        }

    }
}

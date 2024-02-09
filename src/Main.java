public class Main {
    public static void main(String[] args) {
        // Begin HomeWork2 //
        System.out.println("Task 1:");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Value dog = " + dog);
        System.out.println("Value cat = " + cat);
        System.out.println("Value paper = " + paper);

        System.out.println("Task 2:");
        var mulDog = dog * 4;
        var mulCat = cat * 4;
        var mulPaper = paper * 4;
        System.out.println("Value dog * 4 = " + mulDog);
        System.out.println("Value cat * 4 = " + mulCat);
        System.out.println("Value paper * 4 = " + mulPaper);

        System.out.println("Task 3:");
        var divDog = mulDog / 3.5;
        var divCat = mulCat / 1.6;
        var divPaper = mulPaper / 7639;
        System.out.println("Value dog * 4 / 3.5 = " + divDog);
        System.out.println("Value cat * 4 / 1.6 = " + divCat);
        System.out.println("Value paper * 4 / 7639 = " + divPaper);

        System.out.println("Task 4:");
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Task 5:");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Task 6:");
        var firstWeight = 78.2;
        System.out.println("Вес первого бойца " + firstWeight);
        var secondFighter = 82.7;
        System.out.println("Вес второго бойца " + secondFighter);
        var totalWeight = firstWeight + secondFighter;
        System.out.println("Total weight = " + totalWeight);
        var diffWeight = secondFighter - firstWeight;
        System.out.println("Второй боец весит больше первого на " + diffWeight + " кг");

        System.out.println("Task 7:");
        var remWeight = secondFighter % firstWeight;
        System.out.println("Разница в весе между двумя бойцами - " + remWeight + " кг");

        System.out.println("Task 8:");
        var totalHours = 640;
        var perWorker = 8;
        var workers = totalHours / perWorker;
        System.out.println("В организации на сотрудников выделено " + totalHours + " часов");
        System.out.println("Один сотрудник выполняет работу за " + perWorker + " часов");
        System.out.println("Всего работников в компании — " + workers + " человек");
        workers = workers + 94;
        var newPerWorkers = totalHours / workers;
        System.out.println("Если в компании работает " + workers + " человека, то всего по " + newPerWorkers + " часа работы может быть поделено между сотрудниками");
        // End HomeWork2 //
    }
}

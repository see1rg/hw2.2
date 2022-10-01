public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Grande", "желтого цвета", "сборка в России",
                1.7, "2015 год выпуска", "ee123", "АКП", "седан",
                true, 5,null, null,120);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", "черный цвет кузова",
                "сборка в Германии", 3.0, "2020 год выпуска");
        Car bmw = new Car("BMW", "Z8", "черный цвет кузова", "сборка в Германии",
                3.0, "в 2021 году");
        Car kia = new Car("Kia", "Sportage 4 поколение", "цвет кузова красный",
                "сборка в Южной Корее", 2.4, "2018 год выпуска");
        Car hyundai = new Car( "hyundai", "Avante", "цвет кузова оранжевый",
                "сборка в Южной Корее", 0.0, "год выпуска - 2016 год");
        Train leningrad = new Train("Ленинград", "D-125", "2019",
                "Россия", null, 270, 1700, null,
                "Ленинградский вокзал", "Ленинград-Пассажирский",
                8);
        Train lastochka = new Train("Ласточка", "B-901", "2011",
                "Россия", null, 301, 3500, null,
                "Белорусский вокзал", "Минск-Пассажирский",
                11);

        Bus ikarus = new Bus("ikarus", "f112", "1983",
                "Hungary", "Yellow", 160);
        Bus lviv = new Bus("Львiв", "З12", "1978",
                "УССР", "Белый", 140);
        Bus liaz = new Bus("Лиаз", "л22", "1977",
                "СССР", "Yellow", 150);
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

        System.out.println(lastochka);
        System.out.println(leningrad);

        System.out.println(ikarus);
        System.out.println(lviv);
        System.out.println(liaz);

        lastochka.refill();
        lviv.refill();
        kia.refill();


    }
}
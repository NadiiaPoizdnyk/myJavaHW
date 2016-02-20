package boxes;

class HeavyBox extends Box {
    int weight;

    // Конструктор клона объекта
    HeavyBox(HeavyBox ob) { // передача объекта конструктору
        super(ob);
        weight = ob.weight;
    }

    // Конструктор, используемый при указании всех параметров
    HeavyBox(int w, int h, int d, int m) {
        super(w, h, d); // вызов конструктора суперкласса
        weight = m; // масса
    }

    // Конструктор по умолчанию
    HeavyBox() {
        super();
        weight = -1;
    }

    // Конструктор для создания куба
    HeavyBox(int len, int m) {
        super(len);
        weight = m;
    }
}
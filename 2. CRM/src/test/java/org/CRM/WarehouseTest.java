package org.CRM;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class WarehouseTest {

    private static Warehouse testWarehouse1;
    private static Warehouse testWarehouse2;

    @BeforeAll
    public static void before() throws IOException {
        testWarehouse1 = new Warehouse("Kazan", "Kytya 2");
    }

    @Test
    public void test() throws IOException {

    }

    @Test
    public void setCell() throws IOException {
//        testWarehouse.setCell();
    }

    @Test
    public void constructor() throws IOException {
        Warehouse wh = new Warehouse("Kazan", "Kytya 2");
        wh.saveToFile(Warehouse.getSourcePath());
        List<Warehouse> warehouses = Warehouse.loadFromFile(Warehouse.getSourcePath());
        System.out.println(warehouses);
    }
}

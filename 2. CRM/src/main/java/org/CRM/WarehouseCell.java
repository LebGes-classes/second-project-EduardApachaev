package org.CRM;

import java.util.ArrayList;

public class WarehouseCell {
    private Warehouse warehouse;
//    private int size;
    private int number;
    private Product storage;

    public WarehouseCell(Warehouse warehouse, Product storage) {
       this.warehouse = warehouse;
       this.storage = storage;
       warehouse.setCell(this);
    }

}

package org.CRM;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Warehouse {

    private String city;
    private String address;

    private ArrayList<Worker> workers;
    private ArrayList<WarehouseCell> cells;

    private static final String sourcePath = "data/warehouse.json";
    private static final ObjectMapper mapper = new ObjectMapper();

    public Warehouse() throws IOException {
        this.city = null;
        this.address = null;
    }

    public Warehouse(String city, String address) throws IOException {
        this.city = city;
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Worker> getWorkers() {
        return workers;
    }

    public ArrayList<WarehouseCell> getCells() {
        return cells;
    }

    public void setCell(WarehouseCell cell) {
        this.cells.add(cell);
    }

    public static void saveWarehouses(List<Warehouse> warehouses, String filename) throws IOException {
        mapper.writeValue(new File(filename), warehouses);
    }

    public void saveToFile(String filename) throws IOException {
        List<Warehouse> currentData = loadFromFile(filename);
        currentData.add(this);
        saveWarehouses(currentData, filename);
    }

    public static List<Warehouse> loadFromFile(String filename) throws IOException {
        File file = new File(filename);
        if (!file.exists() || file.length() == 0) {
            return new ArrayList<>();
        }
        return mapper.readValue(file, new TypeReference<List<Warehouse>>() {});
    }

    public static String getSourcePath () {
        return sourcePath;
    }
}

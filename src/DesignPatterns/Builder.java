package DesignPatterns;
// Product class

class Computer{
    private String cpu;
    private String gpu;
    private int ram;
    private int storage;
    public Computer() {
    }
    public Computer(String cpu, String gpu, int ram, int storage) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.storage = storage;
    }
    public String getCpu() {
        return cpu;
    }
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public String getGpu() {
        return gpu;
    }
    public void setGpu(String gpu) {
        this.gpu = gpu;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public int getStorage() {
        return storage;
    }
    public void setStorage(int storage) {
        this.storage = storage;
    }
    @Override
    public String toString() {
        return "Computer [cpu=" + cpu + ", gpu=" + gpu + ", ram=" + ram + ", storage=" + storage + "]";
    }

    
}

// Builder interface

interface ComputerBuilder{
    ComputerBuilder setCpu(String cpu);
    ComputerBuilder setGpu(String gpu);
    ComputerBuilder setRam(int ram);
    ComputerBuilder setStorage(int storage);
    Computer build();
}

// Concrete builder

// Concrete builder
class StandardComputerBuilder implements ComputerBuilder {
    private String cpu;
    private String gpu;
    private int ram;
    private int storage;

    @Override
    public ComputerBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    @Override
    public ComputerBuilder setGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    @Override
    public ComputerBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    @Override
    public ComputerBuilder setStorage(int storage) {
        this.storage = storage;
        return this;
    }

    @Override
    public Computer build() {
        return new Computer(cpu, gpu, ram, storage);
    }
}


public class Builder {
    

    public static void main(String[] args) {
        
        Computer computer=new StandardComputerBuilder().setCpu("Intel I5").setRam(1024).build();

        System.out.println(computer);



    }
}

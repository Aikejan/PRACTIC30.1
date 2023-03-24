package servize.serviceImpl;

import db.DataBaza;
import model.Groub;
import servize.GroubService;

import java.util.List;
import java.util.stream.Collectors;

public class GroubServize implements GroubService {
    DataBaza dataBaza = new DataBaza();
    @Override
    public String addNewGroub(Groub groub) {
        dataBaza.getGroubs().add(groub);
        return "succes";
    }

    @Override
    public String getGroupById(int id) {
        dataBaza.getGroubs().stream().count();
        return "succes";
    }

    @Override
    public List<Groub> getAllGroubs() {
       return dataBaza.getGroubs().stream().toList();

    }

    @Override
    public String upDateGroub(int id, String name) {
        return null;
    }

    @Override
    public List<Groub> filterByYear(int year, String ascDesc) {
        return null;
    }

    @Override
    public List<Groub> groupByYear(String ascDesc) {
        return null;
    }

    @Override
    public void deleteGroubById(int id) {
        //dataBaza.getGroubs().equals(deleteGroubById();

    }
}

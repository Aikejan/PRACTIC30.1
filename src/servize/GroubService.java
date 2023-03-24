package servize;

import model.Groub;

import java.util.List;

public interface GroubService {
    String addNewGroub(Groub groub);
    String getGroupById(int id);
    List<Groub>getAllGroubs();
    String upDateGroub(int id, String name);
    List<Groub>filterByYear(int year,String ascDesc);
    List<Groub>groupByYear(String ascDesc);
    void  deleteGroubById(int id);

}

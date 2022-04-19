package poo.ejercicioInterfaces;

import poo.herencia.Coche;

import java.util.List;

public interface CocheCRUD {

    void save();

    List<Coche> findAll();

    void delete();
}

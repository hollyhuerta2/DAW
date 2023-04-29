package Datos;

import HAHP.Cursos;
import Modelo.HAHP.Cursos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//DAO = Data Access Object
public class CursosDAO {
    private static final String selectSQL ="SELECT *FROM cursos";
    public List<Cursos> listar() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Cursos curso = null;
        List<Cursos> cursos = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(selectSQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                int idcurso = rs.getInt("idcurso");
                String materiafk = rs.getString("materiafk");
                String horario = rs.getString("horario");
                int profk = rs.getInt("profk");
                int semesfk = rs.getInt("semestre");
                int cupo = rs.getInt("cupo");
                curso = new Cursos(idcurso,materiafk,horario,profk,semesfk,cupo);
                cursos.add(curso);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
            Conexion.close(conn);
        }
        return cursos;
    }
}

package procesobatch;

import java.sql.*;

public class Init {
    public static void primerEjercicio(Connection conn) throws SQLException {
        Statement stm = conn.createStatement();
        
        StringBuilder strSQL = new StringBuilder();
        
        strSQL
                .append("INSERT INTO tickets ")
                .append("(id, patente, tipoVechiculo, velocidadMedida, importeMulta) ")
                .append("VALUES (")
                .append("'" + java.util.UUID.randomUUID().toString() + "'")
                .append(",'A023','CAMION', 70, 0")
                .append(");");
        
        System.out.println(strSQL.toString());
        stm.execute(strSQL.toString());
        
        stm.close();
    }
    public static void main(String[] args) throws Exception {
        Connection conn = ConnectionFactory.crearConexion();
        primerEjercicio(conn);
        conn.close();
    }
}

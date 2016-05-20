package dao;


/**
 *  @author teacher
 *   @param <T>
 */
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.82F05045-3BF8-276D-6AEF-6C2D6ADB0E50]
// </editor-fold> 
public interface DAOInterface < T > {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C875FF39-B207-9A6E-519E-EB43961490DE]
    // </editor-fold> 
    public void insert (T t) throws java.sql.SQLException;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CAEC7EF3-5321-1EA3-006D-F1C473EEAFA3]
    // </editor-fold> 
    public void delete (T t) throws java.sql.SQLException;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CDD8E0CF-7F98-ABF5-3752-3E1BA9296BED]
    // </editor-fold> 
    public void update (T t) throws java.sql.SQLException;

}


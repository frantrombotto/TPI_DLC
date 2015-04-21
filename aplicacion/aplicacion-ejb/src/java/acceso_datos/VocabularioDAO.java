/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acceso_datos;

import javax.persistence.EntityManager;

/**
 *
 * @author Candelaria
 */

public class VocabularioDAO {
    @PersistenceContext(name= "aplicacion-ejbPU")EntityManager em;
    
    
}

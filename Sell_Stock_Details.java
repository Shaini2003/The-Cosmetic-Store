import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

 class stock {
  public void stockremaining() {
    System.out.println("stock remaining add new products");
  }
}

class productname extends stock {
  public void stockremaining() {
    System.out.println("Give product name to add");
  }
}

class productcategory extends stock {
  public void stockremaining() {
    System.out.println("add new catogeries");
  }
}
 

public final class Sell_Stock_Details extends javax.swing.JFrame {
    
  public class Product {
    private  int product_id;
    private String product_name;
    private String product_category;
    private int Quantity;
    
        public Product(int product_id, String product_name,String product_category,int Quantity){
        this.product_id=product_id;
        this.product_name=product_name;
        this.product_category=product_category;
        this.Quantity=Quantity;
        

    }
}
    

    
    public Sell_Stock_Details() {
        initComponents();
        addRowToJTable();
        
    }

     public ArrayList ListProducts()
    {
        ArrayList<Product> list = new ArrayList<Product>();
        Product u1 = new Product(1,"Ponds","Face cream",10);
        Product u2 = new Product(2,"spa ceylon","body lotion",20);
        Product u3 = new Product(3,"lifeboy","shampoo",30);
        Product u4 = new Product(4,"Tressemme","shampoo",40);
        Product u5 = new Product(5,"Janet","Face cream",50);
        Product u6 = new Product(6,"Himalaya","Face wash",60);
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        list.add(u5);
        list.add(u6);
        return list;
    }
     public void addRowToJTable()
    {
        DefaultTableModel model = (DefaultTableModel) StockTable.getModel();
        ArrayList<Product> list = ListProducts();
        Object rowData[] = new Object[4];
        for(int i = 0; i < list.size(); i++)
        {
            rowData[0] = list.get(i).product_id;
            rowData[1] = list.get(i).product_name;
            rowData[2] = list.get(i).product_category;
            rowData[3] = list.get(i).Quantity;
            model.addRow(rowData);
        }
                
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        StockTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 120));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Sell Stock Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 209, 31));

        StockTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Id", "Product name", "Product catogery", "Quantity"
            }
        ));
        jScrollPane2.setViewportView(StockTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 662, -1));

        jButton1.setBackground(new java.awt.Color(102, 0, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 80, -1));

        jButton2.setBackground(new java.awt.Color(51, 255, 255));
        jButton2.setText("Add new products");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        View_product_details b1=new View_product_details();
        b1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int a= JOptionPane.showConfirmDialog(null,"Do you want to add new products","select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            Add_New_Products a1=new Add_New_Products();
            a1.setVisible(true);
            this.dispose();
            
            stock b1 = new stock(); 
    stock w1 = new productname();  
    stock s1 = new productcategory();  
    b1.stockremaining();
    w1.stockremaining();
    s1.stockremaining();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sell_Stock_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sell_Stock_Details().setVisible(true);
                
                
            }
        });
        
    
    } 

                 


        

        
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable StockTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
    

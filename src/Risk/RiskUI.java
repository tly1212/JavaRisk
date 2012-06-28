/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * RiskUI.java
 *
 * Created on Nov 9, 2010, 10:19:49 PM
 */

package Risk;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;


public class RiskUI extends javax.swing.JFrame implements MouseListener {
        RiskGame risk;
    public RiskUI() {
        risk = new RiskGame();
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        jPanel1.repaint();
        jPanel1.addMouseListener(this);
        AttackButton.setVisible(false);

    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Edit
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        /*
        jPanel1 = new javax.swing.JPanel();
        */ jPanel1 = new MapPanel(risk);
        /*
        jPanel3 = new javax.swing.JPanel();
        */ jPanel3 = new PlayerPanel(risk);
        statusLabel = new javax.swing.JLabel();
        AttackButton = new javax.swing.JButton();
        EndButton = new javax.swing.JButton();
        FortifyButton = new javax.swing.JButton();
        CardButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(RiskUI.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setBackground(resourceMap.getColor("Form.background")); // NOI18N
        setForeground(resourceMap.getColor("Form.foreground")); // NOI18N
        setName("Form"); // NOI18N

        jPanel1.setBackground(resourceMap.getColor("jPanel1.background")); // NOI18N
        jPanel1.setBorder(null);
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(null);

        jPanel3.setBackground(resourceMap.getColor("jPanel3.background")); // NOI18N
        jPanel3.setBorder(null);
        jPanel3.setForeground(resourceMap.getColor("jPanel3.foreground")); // NOI18N
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setName("jPanel3"); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        statusLabel.setFont(resourceMap.getFont("statusLabel.font")); // NOI18N
        statusLabel.setForeground(resourceMap.getColor("statusLabel.foreground")); // NOI18N
        statusLabel.setText(resourceMap.getString("statusLabel.text")); // NOI18N
        statusLabel.setName("statusLabel"); // NOI18N
        jPanel3.add(statusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 63, 427, -1));

        AttackButton.setFont(resourceMap.getFont("AttackButton.font")); // NOI18N
        AttackButton.setText(resourceMap.getString("AttackButton.text")); // NOI18N
        AttackButton.setName("AttackButton"); // NOI18N
        AttackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AttackButtonMouseClicked(evt);
            }
        });
        jPanel3.add(AttackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 89, -1));

        EndButton.setVisible(false);
        EndButton.setFont(resourceMap.getFont("EndButton.font")); // NOI18N
        EndButton.setText(resourceMap.getString("EndButton.text")); // NOI18N
        EndButton.setName("EndButton"); // NOI18N
        EndButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EndButtonMouseClicked(evt);
            }
        });
        jPanel3.add(EndButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, -1, -1));

        FortifyButton.setVisible(false);
        FortifyButton.setFont(resourceMap.getFont("FortifyButton.font")); // NOI18N
        FortifyButton.setText(resourceMap.getString("FortifyButton.text")); // NOI18N
        FortifyButton.setName("FortifyButton"); // NOI18N
        FortifyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FortifyButtonMouseClicked(evt);
            }
        });
        jPanel3.add(FortifyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 10, 90, -1));

        CardButton.setVisible(false);
        CardButton.setFont(resourceMap.getFont("CardButton.font")); // NOI18N
        CardButton.setText(resourceMap.getString("CardButton.text")); // NOI18N
        CardButton.setName("CardButton"); // NOI18N
        CardButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CardButtonMouseClicked(evt);
            }
        });
        jPanel3.add(CardButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 10, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AttackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AttackButtonMouseClicked
        risk.setState(RiskGame.ATTACK);
        FortifyButton.setVisible(false);
        EndButton.setVisible(false);
        statusLabel.setText("Select a territory to attack with");
        if(AttackButton.getText().equals("Retreat")){
            risk.setState(RiskGame.ACTIVE_TURN);
            risk.aTerritory = null;
            risk.dTerritory = null;
            if(risk.active == risk.defender )
                risk.active = risk.curPlayer;
            risk.defNum = 0;
            risk.attNum = 0;
            AttackButton.setText("Attack");
            EndButton.setVisible(true);
            FortifyButton.setVisible(true);
            statusLabel.setText("What would you like to do?");
            jPanel1.repaint();
        }
       // AttackButton.setText("Retreat");

    }//GEN-LAST:event_AttackButtonMouseClicked

    private void EndButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EndButtonMouseClicked
       risk.nextPlayer();
       risk.setState(RiskGame.START_TURN);
       risk.gamePhaseActive(0, 0);
       risk.active = risk.curPlayer;
       jPanel3.repaint();
       statusLabel.setText("Recieved a bonus of " + risk.curPlayer.getNumberOfArmies());
       AttackButton.setVisible(false);
       EndButton.setVisible(false);
       FortifyButton.setVisible(false);
       risk.drawn = false;


    }//GEN-LAST:event_EndButtonMouseClicked

    private void FortifyButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FortifyButtonMouseClicked
      risk.setState(RiskGame.FORTIFY);
      statusLabel.setText("Select a country move armies from");
    }//GEN-LAST:event_FortifyButtonMouseClicked

    private void CardButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CardButtonMouseClicked
        risk.setState(RiskGame.TRADE_CARDS);
        jPanel1.repaint();
    }//GEN-LAST:event_CardButtonMouseClicked


    public static void ShowGUI() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() { new RiskUI().setVisible(true);}
        });
    }


    private int i;
    private JPanel controlPanel1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AttackButton;
    private javax.swing.JButton CardButton;
    private javax.swing.JButton EndButton;
    private javax.swing.JButton FortifyButton;
    /*
    private javax.swing.JPanel jPanel1;
    */private MapPanel jPanel1;
    /*
    private javax.swing.JPanel jPanel3;
    */ private PlayerPanel jPanel3;
    private javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables


    public void mouseClicked(MouseEvent me) {
       int x = me.getX();
       int y = me.getY();
       String name;
       String out;

       if (risk.getState() == RiskGame.NEW_GAME){
           risk.gamePhaseSetup(x,y);
           name = risk.curPlayer.getName();
           statusLabel.setText("Place an army on a unoccupied territory");
       }

       if(risk.getState() == RiskGame.INITIAL_REINFORCE){
           risk.gamePhaseSetup(x, y);
           name = risk.curPlayer.getName();
         statusLabel.setText("Place an army on a territory you occupy");
       }


      if(risk.getState() == RiskGame.ATTACK){
          name = risk.curPlayer.getName();
          if(risk.getState() == RiskGame.ATTACKING){
             AttackButton.setText("Retreat");
             statusLabel.setText("Select an opposing territory");
          }
          out = risk.gamePhaseActive(x,y);
      }

      if(risk.getState() == RiskGame.START_TURN){
          risk.gamePhaseActive(x, y);
          risk.active = risk.curPlayer;
          name = risk.curPlayer.getName();
          statusLabel.setText("Recieved a bonus of " + risk.curPlayer.getNumberOfArmies());

      }

      if(risk.getState() == RiskGame.REINFORCE){
            name = risk.curPlayer.getName();
            risk.gamePhaseActive(x, y);
            statusLabel.setText
            ("You have "+risk.curPlayer.getNumberOfArmies()+" left to place");
            if(risk.curPlayer.getNumberOfArmies() == 0){
                risk.setState(RiskGame.ACTIVE_TURN);
            }

      }

      if(risk.getState() == RiskGame.ACTIVE_TURN){
          name = risk.curPlayer.getName();
          statusLabel.setText("What would you like to do?");
          EndButton.setVisible(true);
          FortifyButton.setVisible(true);
          AttackButton.setText("Attack");
          AttackButton.setVisible(true);
           if(risk.curPlayer.getCard().size() > 2)
                CardButton.setVisible(true);
            else
                CardButton.setVisible(false);
      }

      if(risk.getState() == RiskGame.ATTACKING){
          name = risk.curPlayer.getName();
          AttackButton.setText("Retreat");
          statusLabel.setText("Select an opposing territory");
          out = risk.gamePhaseActive(x,y);
          //System.out.println(out);
      }

     if(risk.getState() == RiskGame.ATTACK_PHASE){
           // jInternalFrame1.setVisible(true);
           int att = risk.aTerritory.getArmies();
           int def = risk.dTerritory.getArmies();
           int numofatt = 0;
           //If attackers turn
           if(risk.active == risk.curPlayer){
            if(att > 3){
                if(y > 250 && y < 280){//if in y coord
                    if(x > 420 && x < 460) //If dice one
                       numofatt = 1;
                    if(x > 480 && x < 520) //if dice two
                       numofatt = 2;
                    if(x > 540 && x < 580)
                        numofatt = 3;
                }//in y coord
            }//if attcking with 3
               if(att == 3){//if attakking with two
                   if(y > 250 && y < 280){
                       if(x > 460 && x < 500)
                           numofatt = 1;
                       if(x > 510 && x < 550)
                           numofatt = 2;
                   }//in y coord
               }//end if can attack with two

               if(att == 2){//can only attack with one
                       if(y > 250 && y < 280){
                            if(x > 480 && x < 520)
                                numofatt = 1;
                       }//in y
               }//end only attack with one

               if(numofatt != 0){//change player is num is selected
                   risk.active = risk.defender;
                   risk.setAttack(numofatt);
               }



               
           }//end attackers turn
           
           //If defenders turn
           else if(risk.active == risk.defender){
                if(def > 1 && risk.attNum > 1){
                   if(y > 250 && y < 280){
                       if(x > 460 && x < 500)
                           numofatt = 1;
                       if(x > 510 && x < 550)
                           numofatt = 2;
                   }
               }
                else{
                      if(y > 250 && y < 280){
                           if(x > 480 && x < 520)
                              numofatt = 1;
                       }
               }

               if(numofatt > 0){
                    risk.setDefend(numofatt);
                    risk.engageBattle();
                    if(def - risk.dTerritory.getArmies() == 1)
                        statusLabel.setText(risk.curPlayer.getName()+ " has destroyed an army");
                    else if(def - risk.dTerritory.getArmies() == 2)
                        statusLabel.setText(risk.curPlayer.getName()+ " has destroyed two armies");
                    else if(att - risk.aTerritory.getArmies() == 1)
                        statusLabel.setText(risk.curPlayer.getName()+ " has lost an army");
                    else if(att - risk.aTerritory.getArmies() == 2)
                        statusLabel.setText(risk.curPlayer.getName()+ " has lost two armies");

                    if(risk.aTerritory.getArmies() == 1){
                        risk.setState(RiskGame.ACTIVE_TURN);
                        statusLabel.setText(risk.curPlayer.getName()+ " has lost the battle");
                        AttackButton.setText("Attack");
                        FortifyButton.setVisible(true);
                        EndButton.setVisible(true);
                        risk.defNum = 0;
                        risk.attNum = 0;
                        risk.dTerritory = null;
                        risk.aTerritory = null;
                    }
                }

           }///end if defenders turn

      } //End attackPhase

       if(risk.getState() == RiskGame.CAPTURE){
           statusLabel.setText("Select number of armies to move to "+ risk.dTerritory.getName());
           AttackButton.setVisible(false);
           AttackButton.setText("Attack");
           int max = risk.aTerritory.getArmies() -1;
           int min = risk.attNum;
           if(y > 230 && y < 257){//if y is correct
               if(x > 600 && x < 650)//if max
                   risk.defNum = risk.aTerritory.getArmies() -1; //max
               if(x > 520 && x < 570){ //if inc
                    if(risk.defNum < max)
                      risk.defNum++;
                    else
                       statusLabel.setText("Maximum units already selected");
               }//end if sub
               if(x > 440 && x < 490){//if dec
               if(risk.defNum > min)
                       risk.defNum--;
                   else
                       statusLabel.setText("Minimum units already selected");
               }//end if add
               if(x > 360 && x < 410)//min
                   risk.defNum = min;
           }//end if y coord

           if(x > 460 && x < 545){//move has ben clicked
               if(y > 325 && y < 355){//then occupy the territory
                  AttackButton.setVisible(true);
                  if(risk.defNum == 1)
                     statusLabel.setText("1 army moved to "+risk.dTerritory.getName());
                  else
                     statusLabel.setText(risk.defNum+" armies moved to "+risk.dTerritory.getName());

                 EndButton.setVisible(true);
                 FortifyButton.setVisible(true);
                 risk.capture();
               }
           }



       }//end capturing



       if(risk.getState() == RiskGame.FORTIFY){
            risk.gamePhaseActive(x,y);
            statusLabel.setText("Select a country to move armies too");

       }

       if(risk.getState() == RiskGame.FORTIFYING){
            risk.gamePhaseActive(x,y);
       }

       if(risk.getState() == RiskGame.FORTIFY_PHASE){
           int from = risk.aTerritory.getArmies();

           if(y > 230 && y < 257){//if y is correct
             if(x > 600 && x < 650)//if max
               if(risk.defNum == (from -1))
                 statusLabel.setText("Maximum units already selected");
               else
                 risk.defNum = (from - 1);//all but one
             if(x > 520 && x < 570){ //if inc
                if(risk.defNum < (from - 1))
                   risk.defNum++;
                 else
                   statusLabel.setText("Maximum units already selected");
             }//end if inc
             if(x > 440 && x < 490){//if dec
               if(risk.defNum > (from - 1))
                       risk.defNum--;
                   else
                       statusLabel.setText("Minimum units already selected");
             }//end if add
               if(x > 360 && x < 410)//min
                  if(risk.defNum == 0)
                    statusLabel.setText("Minimum units already selected");
                  else
                   risk.defNum = 0;
           }//end if y coord


           if(x > 460 && x < 545){//move has ben clicked
               if(y > 325 && y < 355){//then occupy the territory
                  AttackButton.setVisible(false);
                  if(risk.defNum == 1)
                     statusLabel.setText("1 army moved to "+risk.dTerritory.getName());
                  else
                     statusLabel.setText(risk.defNum+" armies moved to "+risk.dTerritory.getName());

                 EndButton.setVisible(true);
                 FortifyButton.setVisible(false);
                 risk.aTerritory.looseArmies(risk.defNum);
                 risk.dTerritory.addArmies(risk.defNum);
                 risk.setState(RiskGame.ACTIVE_TURN);
               }       //end y
           }//end x for movwe


       }//..fortify phase


       if(risk.getState() == RiskGame.TRADE_CARDS){
              if(y > 350 && y < 380 ){
                 if(x > 475 && x < 525){ //if exxti button pushed
                      risk.setState(RiskGame.ACTIVE_TURN);
                      System.out.println("exitt");
                 }
               }//end exit







       }//end trade cards
       
      System.out.println("("+x+", "+y+")");


       jPanel1.repaint();
       jPanel3.repaint();

        

    }

   void saySomething(String desc, MouseEvent e){
 //      jTextArea1.append(desc +  " (" + e.getX() + "," + e.getY() + ")\n");
    }

    public void mousePressed(MouseEvent me) {
    }

    public void mouseReleased(MouseEvent me) {
    }

    public void mouseEntered(MouseEvent me) {
    }

    public void mouseExited(MouseEvent me) {
    }

}
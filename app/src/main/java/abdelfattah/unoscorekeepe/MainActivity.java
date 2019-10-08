package abdelfattah.unoscorekeepe;

import com.github.clans.fab.FloatingActionButton;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.content.DialogInterface;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    /**
     * Declaration of global variables used
     */
    int scoreForPlayer_1, scoreForPlayer_2, scoreForPlayer_3, scoreForPlayer_4
      , scoreForPlayer_5, scoreForPlayer_6,scoreForPlayer_7,scoreForPlayer_8
      ,scoreForPlayer_9,scoreForPlayer_10;
    LinearLayout  player_1,player_2,player_3,player_4,player_5
                 ,player_6,player_7,player_8,player_9,player_10;
    LinearLayout  LayoutPlayer_1_2,LayoutPlayer_3_4,LayoutPlayer_5_6
                 ,LayoutPlayer_7_8,LayoutPlayer_9_10;
    FloatingActionButton player_1_2,player_3_4,player_5_6,player_7_8,player_9_10;
    View view_1_2,view_3_4,view_5_6,view_7_8;
    TextView playerName_1, playerName_2, playerName_3, playerName_4, playerName_5,
             playerName_6, playerName_7, playerName_8, playerName_9, playerName_10;
    private String m_Text = "0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );


        Button fab1 = findViewById ( R.id.reset );
        fab1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                setScoreToZero();
            }
        } );
        player_1 = (LinearLayout) findViewById(R.id.player_1);
        player_2 = (LinearLayout) findViewById(R.id.player_2);
        player_3 = (LinearLayout) findViewById(R.id.player_3);
        player_4 = (LinearLayout) findViewById(R.id.player_4);
        player_5 = (LinearLayout) findViewById(R.id.player_5);
        player_6 = (LinearLayout) findViewById(R.id.player_6);
        player_7 = (LinearLayout) findViewById(R.id.player_7);
        player_8 = (LinearLayout) findViewById(R.id.player_8);
        player_9 = (LinearLayout) findViewById(R.id.player_9);
        player_10 = (LinearLayout) findViewById(R.id.player_10);
        player_1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                onClick_Dialog_Value (1);
            }
        } );
        player_2.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                onClick_Dialog_Value (2);
            }
        } );
        player_3.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                onClick_Dialog_Value (3);
            }
        } );
        player_4.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                onClick_Dialog_Value (4);
            }
        } );
        player_5.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                onClick_Dialog_Value (5);
            }
        } );
        player_6.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                onClick_Dialog_Value (6);
        }
        } );
        player_7.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                onClick_Dialog_Value (7);
            }
        } );
        player_8.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                onClick_Dialog_Value (8);
            }
        } );
        player_9.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                onClick_Dialog_Value (9);
            }
        } );
        player_10.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                onClick_Dialog_Value (10);
            }
        } );
        playerName_1 = (TextView) findViewById(R.id.player_1_view);
        playerName_2 = (TextView) findViewById(R.id.player_2_view);
        playerName_3 = (TextView) findViewById(R.id.player_3_view);
        playerName_4 = (TextView) findViewById(R.id.player_4_view);
        playerName_5 = (TextView) findViewById(R.id.player_5_view);
        playerName_6 = (TextView) findViewById(R.id.player_6_view);
        playerName_7 = (TextView) findViewById(R.id.player_7_view);
        playerName_8 = (TextView) findViewById(R.id.player_8_view);
        playerName_9 = (TextView) findViewById(R.id.player_9_view);
        playerName_10 = (TextView) findViewById(R.id.player_10_view);
        playerName_1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                onClick_Dialog_Name (1);
            }
        } );
        playerName_2.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                onClick_Dialog_Name (2);
            }
        } );
        playerName_3.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                onClick_Dialog_Name (3);
            }
        } );
        playerName_4.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                onClick_Dialog_Name (4);
            }
        } );
        playerName_5.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                onClick_Dialog_Name (5);
            }
        } );
        playerName_6.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                onClick_Dialog_Name (6);
            }
        } );
        playerName_7.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                onClick_Dialog_Name (7);
            }
        } );
        playerName_8.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                onClick_Dialog_Name (8);
            }
        } );
        playerName_9.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                onClick_Dialog_Name (9);
            }
        } );
        playerName_10.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                onClick_Dialog_Name (10);
            }
        } );
        player_1_2 =(FloatingActionButton) findViewById ( R.id.player_1_2 );
        player_3_4 =(FloatingActionButton) findViewById ( R.id.player_3_4 );
        player_5_6 =(FloatingActionButton) findViewById ( R.id.player_5_6 );
        player_7_8 =(FloatingActionButton) findViewById ( R.id.player_7_8 );
        player_9_10 =(FloatingActionButton) findViewById ( R.id.player_9_10 );
        LayoutPlayer_1_2 =(LinearLayout) findViewById ( R.id.Layout_player_1_2 );
        LayoutPlayer_3_4 =(LinearLayout) findViewById ( R.id.Layout_player_3_4 );
        LayoutPlayer_5_6 =(LinearLayout) findViewById ( R.id.Layout_player_5_6 );
        LayoutPlayer_7_8 =(LinearLayout) findViewById ( R.id.Layout_player_7_8 );
        LayoutPlayer_9_10 =(LinearLayout) findViewById ( R.id.Layout_player_9_10 );
        view_1_2 =(View) findViewById ( R.id.view_1_2 );
        view_3_4 =(View) findViewById ( R.id.view_3_4 );
        view_5_6 =(View) findViewById ( R.id.view_5_6 );
        view_7_8 =(View) findViewById ( R.id.view_7_8 );
        player_1_2.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                LayoutPlayer_1_2.setVisibility ( View.VISIBLE );
                view_1_2.setVisibility ( View.VISIBLE );
                LayoutPlayer_3_4.setVisibility ( View.GONE );
                view_3_4.setVisibility ( View.GONE );
                LayoutPlayer_5_6.setVisibility ( View.GONE );
                view_5_6.setVisibility ( View.GONE );
                LayoutPlayer_7_8.setVisibility ( View.GONE );
                view_7_8.setVisibility ( View.GONE );
                LayoutPlayer_9_10.setVisibility ( View.GONE );

            }
        } );
        player_3_4.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                LayoutPlayer_1_2.setVisibility ( View.VISIBLE );
                view_1_2.setVisibility ( View.VISIBLE );
                LayoutPlayer_3_4.setVisibility ( View.VISIBLE );
                view_3_4.setVisibility ( View.VISIBLE );
                LayoutPlayer_5_6.setVisibility ( View.GONE );
                view_5_6.setVisibility ( View.GONE );
                LayoutPlayer_7_8.setVisibility ( View.GONE );
                view_7_8.setVisibility ( View.GONE);
                LayoutPlayer_9_10.setVisibility ( View.GONE );

            }
        } );
        player_5_6.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                LayoutPlayer_1_2.setVisibility ( View.VISIBLE );
                view_1_2.setVisibility ( View.VISIBLE );
                LayoutPlayer_3_4.setVisibility ( View.VISIBLE );
                view_3_4.setVisibility ( View.VISIBLE );
                LayoutPlayer_5_6.setVisibility ( View.VISIBLE );
                view_5_6.setVisibility ( View.VISIBLE );
                LayoutPlayer_7_8.setVisibility ( View.GONE );
                view_7_8.setVisibility ( View.GONE );
                LayoutPlayer_9_10.setVisibility ( View.GONE );

            }
        } );
        player_7_8.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                LayoutPlayer_1_2.setVisibility ( View.VISIBLE );
                view_1_2.setVisibility ( View.VISIBLE );
                LayoutPlayer_3_4.setVisibility ( View.VISIBLE );
                view_3_4.setVisibility ( View.VISIBLE );
                LayoutPlayer_5_6.setVisibility ( View.VISIBLE );
                view_5_6.setVisibility ( View.VISIBLE );
                LayoutPlayer_7_8.setVisibility ( View.VISIBLE);
                view_7_8.setVisibility ( View.VISIBLE );
                LayoutPlayer_9_10.setVisibility ( View.GONE );

            }
        } );
        player_9_10.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                LayoutPlayer_1_2.setVisibility ( View.VISIBLE );
                view_1_2.setVisibility ( View.VISIBLE );
                LayoutPlayer_3_4.setVisibility ( View.VISIBLE );
                view_3_4.setVisibility ( View.VISIBLE );
                LayoutPlayer_5_6.setVisibility ( View.VISIBLE );
                view_5_6.setVisibility ( View.VISIBLE );
                LayoutPlayer_7_8.setVisibility ( View.VISIBLE );
                view_7_8.setVisibility ( View.VISIBLE );
                LayoutPlayer_9_10.setVisibility ( View.VISIBLE);

            }
        } );

    }


    /**
     * Resets the scores to zero, the player names to defaults.
     *
     */
    public void setScoreToZero() {
        m_Text="0";
        scoreForPlayer_1 = 0;
        displayScoreforPlayer_1 ("0");
        scoreForPlayer_2 = 0;
        displayScoreforPlayer_2 ("0");
        scoreForPlayer_3 = 0;
        displayScoreforPlayer_3 ("0");
        scoreForPlayer_4 = 0;
        displayScoreforPlayer_4 ("0");
        scoreForPlayer_5 = 0;
        displayScoreforPlayer_5 ("0");
        scoreForPlayer_6 = 0;
        displayScoreforPlayer_6 ("0");
        scoreForPlayer_7 = 0;
        displayScoreforPlayer_7 ("0");
        scoreForPlayer_8 = 0;
        displayScoreforPlayer_8 ("0");
        scoreForPlayer_9 = 0;
        displayScoreforPlayer_9 ("0");
        scoreForPlayer_10 = 0;
        displayScoreforPlayer_10 ("0");


        playerName_1.setText("Player 1");
        playerName_2.setText("Player 2");
        playerName_3.setText("Player 3");
        playerName_4.setText("Player 4");
        playerName_5.setText("Player 5");
        playerName_6.setText("Player 6");
        playerName_7.setText("Player 7");
        playerName_8.setText("Player 8");
        playerName_9.setText("Player 9");
        playerName_10.setText("Player 10");
    }


    /**
     * Displays the given score for player 1.
     */
    private void displayScoreforPlayer_1(String value) {
        scoreForPlayer_1 += Integer.parseInt (value);
        TextView playerScoreTextView_1 = (TextView) findViewById(R.id.player_1_score);
        playerScoreTextView_1.setText( "" + scoreForPlayer_1 );
        if (scoreForPlayer_1>=500)
        {

          String name = "    Congratulations, hero " + playerName_1.getText ().toString ();;
            theWinDialog ( name );
        }
        m_Text="0";
    }

    /**
     * Displays the given score for player 2.
     */
    private void displayScoreforPlayer_2(String value) {
        scoreForPlayer_2 += Integer.parseInt (value);
        TextView playerScoreTextView_2 = (TextView) findViewById(R.id.player_2_score);
        playerScoreTextView_2.setText( "" + scoreForPlayer_2 );;
        if (scoreForPlayer_2>=500)
        {
            String name = "    Congratulations, hero " + playerName_2.getText ().toString ();;
            theWinDialog ( name );
        }
        m_Text="0";
    }

    /**
     * Displays the given score for player 3.
     */
    private void displayScoreforPlayer_3(String value) {
        scoreForPlayer_3 += Integer.parseInt (value);
        TextView playerScoreTextView_3 = (TextView) findViewById(R.id.player_3_score);
        playerScoreTextView_3.setText( "" + scoreForPlayer_3 );
        if (scoreForPlayer_3>=500)
        {

            String name = "    Congratulations, hero " + playerName_3.getText ().toString ();;
            theWinDialog ( name );
        }
        m_Text="0";
    }

    /**
     * Displays the given score for player 4.
     */
    private void displayScoreforPlayer_4(String value) {
        scoreForPlayer_4 += Integer.parseInt (value);
        TextView playerScoreTextView_4 = (TextView) findViewById(R.id.player_4_score);
        playerScoreTextView_4.setText( "" + scoreForPlayer_4 );
        if (scoreForPlayer_4>=500)
        {

            String name = "    Congratulations, hero " + playerName_4.getText ().toString ();;
            theWinDialog ( name );
        }
        m_Text="0";
    }

    /**
     * Displays the given score for player 5.
     */
    private void displayScoreforPlayer_5(String value) {
        scoreForPlayer_5 += Integer.parseInt (value);
        TextView playerScoreTextView_5 = (TextView) findViewById(R.id.player_5_score);
        playerScoreTextView_5.setText( "" + scoreForPlayer_5 );
        if (scoreForPlayer_5>=500)
        {

            String name = "    Congratulations, hero " + playerName_5.getText ().toString ();;
            theWinDialog ( name );
        }
        m_Text="0";
    }

    /**
     * Displays the given score for player 6.
     */
    private void displayScoreforPlayer_6(String value) {
        scoreForPlayer_6 += Integer.parseInt (value);
        TextView playerScoreTextView_6 = (TextView) findViewById(R.id.player_6_score);
        playerScoreTextView_6.setText( "" + scoreForPlayer_6 );
        if (scoreForPlayer_6>=500)
        {

            String name = "    Congratulations, hero " + playerName_6.getText ().toString ();;
            theWinDialog ( name );
        }
        m_Text="0";
    }
    /**
     * Displays the given score for player 7.
     */
    private void displayScoreforPlayer_7(String value) {
        scoreForPlayer_7 += Integer.parseInt (value);
        TextView playerScoreTextView_7 = (TextView) findViewById(R.id.player_7_score);
        playerScoreTextView_7.setText( "" + scoreForPlayer_7 );
        if (scoreForPlayer_7>=500)
        {

            String name = "    Congratulations, hero " + playerName_7.getText ().toString ();;
            theWinDialog ( name );
        }
        m_Text="0";
    }

    /**
     * Displays the given score for player 8.
     */
    private void displayScoreforPlayer_8(String value) {
        scoreForPlayer_8 += Integer.parseInt (value);
        TextView playerScoreTextView_8 = (TextView) findViewById(R.id.player_8_score);
        playerScoreTextView_8.setText( "" + scoreForPlayer_8 );
        if (scoreForPlayer_8>=500)
        {

            String name = "    Congratulations, hero " + playerName_8.getText ().toString ();;
            theWinDialog ( name );
        }
        m_Text="0";
    }

    /**
     * Displays the given score for player 9.
     */
    private void displayScoreforPlayer_9(String value) {
        scoreForPlayer_9 += Integer.parseInt (value);
        TextView playerScoreTextView_9 = (TextView) findViewById(R.id.player_9_score);
        playerScoreTextView_9.setText( "" + scoreForPlayer_9 );
        if (scoreForPlayer_9>=500)
        {

            String name = "    Congratulations, hero " + playerName_9.getText ().toString ();;
            theWinDialog ( name );
        }
        m_Text="0";
    }

    /**
     * Displays the given score for player 10.
     */
    private void displayScoreforPlayer_10(String value) {
        scoreForPlayer_10 += Integer.parseInt (value);
        TextView playerScoreTextView_10 = (TextView) findViewById(R.id.player_10_score);
        playerScoreTextView_10.setText( "" + scoreForPlayer_10 );
        if (scoreForPlayer_10>=500)
        {

            String name = "    Congratulations, hero " + playerName_10.getText ().toString ();;
            theWinDialog ( name );
        }
        m_Text="0";
    }

    /**
     * Displays the given name for player 1.
     */
    private void displayNameforPlayer_1(String value) {
        playerName_1.setText (value);
        m_Text="";
    }

    /**
     * Displays the given name for player 2.
     */
    private void displayNameforPlayer_2(String value) {
        playerName_1.setText (value);
        m_Text="";
    }

    /**
     * Displays the given name for player 3.
     */
    private void displayNameforPlayer_3(String value) {
        playerName_3.setText (value);
        m_Text="";
    }

    /**
     * Displays the given name for player 4.
     */
    private void displayNameforPlayer_4(String value) {
        playerName_4.setText (value);
        m_Text="";
    }

    /**
     * Displays the given name for player 5.
     */
    private void displayNameforPlayer_5(String value) {
        playerName_5.setText (value);
        m_Text="";
    }

    /**
     * Displays the given name for player 6.
     */
    private void displayNameforPlayer_6(String value) {
        playerName_6.setText (value);
        m_Text="";
    }
    /**
     * Displays the given name for player 7.
     */
    private void displayNameforPlayer_7(String value) {
        playerName_7.setText (value);
        m_Text="";
    }

    /**
     * Displays the given name for player 8.
     */
    private void displayNameforPlayer_8(String value) {
        playerName_8.setText (value);
        m_Text="";
    }

    /**
     * Displays the given name for player 9.
     */
    private void displayNameforPlayer_9(String value) {
        playerName_9.setText (value);
        m_Text="";
    }

    /**
     * Displays the given name for player 10.
     */
    private void displayNameforPlayer_10(String value) {
        playerName_10.setText (value);
        m_Text="";
    }

    public void onClick_Dialog_Value(final int playerNumber) {

        AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);

        //  Inflate the Layout Resource file.
        View mView = getLayoutInflater().inflate(R.layout.dialog_layout, null);

        //  Get View elements from Layout file. Be sure to include inflated view name (mView)
        final EditText mValue = (EditText) mView.findViewById(R.id.etValue);
        mValue.setInputType(InputType.TYPE_CLASS_NUMBER );
        Button mOk = (Button) mView.findViewById(R.id.btnOk);
        Button mCancel = (Button) mView.findViewById(R.id.btnCancel);

        //  Create the AlertDialog using everything we needed from above
        mBuilder.setTitle("set value");
        mBuilder.setView(mView);
        final AlertDialog timerDialog = mBuilder.create();

        //  Set Listener for the OK Button
        mOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                if (!mValue.getText().toString().isEmpty()) {
                    m_Text=mValue.getText().toString();

     switch (playerNumber)
    {
        case 1:
            displayScoreforPlayer_1 (m_Text);
            break;
        case 2:
            displayScoreforPlayer_2 (m_Text);
            break;
        case 3:
            displayScoreforPlayer_3 (m_Text);
            break;
        case 4:
            displayScoreforPlayer_4 (m_Text);
            break;
        case 5:
            displayScoreforPlayer_5 (m_Text);
            break;
        case 6:
            displayScoreforPlayer_6 (m_Text);
            break;
        case 7:
            displayScoreforPlayer_7 (m_Text);
            break;
        case 8:
            displayScoreforPlayer_8 (m_Text);
            break;
        case 9:
            displayScoreforPlayer_9 (m_Text);
            break;
        case 10:
            displayScoreforPlayer_10 (m_Text);
            break;
    }
                       timerDialog.dismiss();

                } else {
                    Toast.makeText(MainActivity.this, "Please enter a Value!", Toast.LENGTH_LONG).show();
                }
            }
        });

        //  Set Listener for the CANCEL Button
        mCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                timerDialog.dismiss();
            }
        });

        //  Finally, SHOW your Dialog!
        timerDialog.show();

    }

    public void onClick_Dialog_Name(final int playerNumber) {

        AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);

        //  Inflate the Layout Resource file.
        View mView = getLayoutInflater().inflate(R.layout.dialog_layout, null);

        //  Get View elements from Layout file. Be sure to include inflated view name (mView)
        final EditText mValue = (EditText) mView.findViewById(R.id.etValue);
        mValue.setInputType(InputType.TYPE_CLASS_TEXT );
        Button mOk = (Button) mView.findViewById(R.id.btnOk);
        Button mCancel = (Button) mView.findViewById(R.id.btnCancel);

        //  Create the AlertDialog using everything we needed from above
        mBuilder.setTitle("set Name");
        mBuilder.setView(mView);
        final AlertDialog timerDialog = mBuilder.create();

        //  Set Listener for the OK Button
        mOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                if (!mValue.getText().toString().isEmpty()) {
                    m_Text=mValue.getText().toString();

                    switch (playerNumber)
                    {
                        case 1:
                            displayNameforPlayer_1 (m_Text);
                            break;
                        case 2:
                            displayNameforPlayer_2 (m_Text);
                            break;
                        case 3:
                            displayNameforPlayer_3 (m_Text);
                            break;
                        case 4:
                            displayNameforPlayer_4 (m_Text);
                            break;
                        case 5:
                            displayNameforPlayer_5 (m_Text);
                            break;
                        case 6:
                            displayNameforPlayer_6 (m_Text);
                            break;
                        case 7:
                            displayNameforPlayer_7 (m_Text);
                            break;
                        case 8:
                            displayNameforPlayer_8 (m_Text);
                            break;
                        case 9:
                            displayNameforPlayer_9 (m_Text);
                            break;
                        case 10:
                            displayNameforPlayer_10 (m_Text);
                            break;
                    }
                    timerDialog.dismiss();

                } else {
                    Toast.makeText(MainActivity.this, "Please enter the player name!", Toast.LENGTH_LONG).show();
                }
            }
        });

        //  Set Listener for the CANCEL Button
        mCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                timerDialog.dismiss();
            }
        });

        //  Finally, SHOW your Dialog!
        timerDialog.show();

    }

public void theWinDialog(String theWinMessage){
    AlertDialog.Builder builder = new AlertDialog.Builder(this);
    builder.setTitle("The Win");


    final TextView theWinTextView = new TextView(this);
    theWinTextView.setText ( theWinMessage );
    builder.setView(theWinTextView);


    builder.setPositiveButton("Reset", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            setScoreToZero ();
        }
    });
    builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            dialog.cancel();
        }
    });

    builder.show();
}
}

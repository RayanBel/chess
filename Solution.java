public class Solution {
    public static boolean isTheKinginCheck(char[][] chessboard) {
        for(int i=0; i<chessboard.length;i++){
            for(int j=0; j<chessboard[i].length; j++){
                switch(chessboard[i][j]){
                case 'P':
                    if(i+1<8){
                        if(j-1>=0)
                            if(chessboard[i+1][j-1]=='K')
                               return true;
                        if(j+1<8)
                            if(chessboard[i+1][j+1]=='K')
                               return true;
                    }
                    break;
                case 'N':
                    if(i+1<8){
                        if(i+2<8){
                            if(j+1<8)
                                if(chessboard[i+2][j+1]=='K')
                                    return true;
                            if(j-1>=0)
                                if(chessboard[i+2][j-1]=='K')
                                    return true;
                        }
                        if(j+2<8)
                            if(chessboard[i+1][j+2]=='K')
                                return true;
                        if(j-2>=0)
                            if(chessboard[i+1][j-2]=='K')
                                return true;
                    }
                    if(i-1>=0){
                        if(i-2>=0){
                            if(j+1<8)
                                if(chessboard[i-2][j+1]=='K')
                                  return true;
                            if(j-1>=0)
                                if(chessboard[i-2][j-1]=='K')
                                  return true;
                        }
                        if(j+2<8)
                            if(chessboard[i-1][j+2]=='K')
                                return true;
                        if(j-2>=0)
                            if(chessboard[i-1][j-2]=='K')
                                return true;
                    }
                    break;
                case 'R':
                    for(int k=i; k<8;k++){
                        if(chessboard[k][j]=='K')
                            return true;
                        if(chessboard[k][j]=='Q'||
                          chessboard[k][j]=='B'||
                          chessboard[k][j]=='N'||
                          chessboard[k][j]=='P')
                            break;
                    }
                    for(int k=j; k<8;k++){
                        if(chessboard[i][k]=='K')
                            return true;
                        if(chessboard[i][k]=='Q'||
                          chessboard[i][k]=='B'||
                          chessboard[i][k]=='N'||
                          chessboard[i][k]=='P')
                            break;
                    }
                    for(int k=i; k>=0;k--){
                        if(chessboard[k][j]=='K')
                            return true;
                        if(chessboard[k][j]=='Q'||
                          chessboard[k][j]=='B'||
                          chessboard[k][j]=='N'||
                          chessboard[k][j]=='P')
                            break;
                    }
                    for(int k=j; k>=0;k--){
                        if(chessboard[i][k]=='K')
                            return true;
                        if(chessboard[i][k]=='Q'||
                          chessboard[i][k]=='B'||
                          chessboard[i][k]=='N'||
                          chessboard[i][k]=='P')
                            break;
                    }
                    break;
                case 'B':
                    for(int k=i,l=j;k<8&&l>=0;k++,l--){
                        if(chessboard[k][l]=='K')
                            return true;
                        if(chessboard[k][l]=='Q'||
                          chessboard[k][l]=='R'||
                          chessboard[k][l]=='N'||
                          chessboard[k][l]=='P')
                            break;
                    }
                    for(int k=i,l=j;k>=0&&l<8;k--,l++){
                        if(chessboard[k][l]=='K')
                            return true;
                        if(chessboard[k][l]=='Q'||
                          chessboard[k][l]=='R'||
                          chessboard[k][l]=='N'||
                          chessboard[k][l]=='P')
                            break;
                    }
                    for(int k=i,l=j;k<8&&l<8;k++,l++){
                        if(chessboard[k][l]=='K')
                            return true;
                        if(chessboard[k][l]=='Q'||
                          chessboard[k][l]=='R'||
                          chessboard[k][l]=='N'||
                          chessboard[k][l]=='P')
                            break;
                    }
                    for(int k=i,l=j;k>=0&&l>=0;k--,l--){
                        if(chessboard[k][l]=='K')
                            return true;
                        if(chessboard[k][l]=='Q'||
                          chessboard[k][l]=='R'||
                          chessboard[k][l]=='N'||
                          chessboard[k][l]=='P')
                            break;
                    }
                    break;
                case 'Q':
                    for(int k=i,l=j;k<8&&l>=0;k++,l--){
                        if(chessboard[k][l]=='K')
                            return true;
                        if(chessboard[k][l]=='B'||
                          chessboard[k][l]=='R'||
                          chessboard[k][l]=='N'||
                          chessboard[k][l]=='P')
                            break;
                    }
                    for(int k=i,l=j;k>=0&&l<8;k--,l++){
                        if(chessboard[k][l]=='K')
                            return true;
                        if(chessboard[k][l]=='B'||
                          chessboard[k][l]=='R'||
                          chessboard[k][l]=='N'||
                          chessboard[k][l]=='P')
                            break;
                    }
                    for(int k=i,l=j;k<8&&l<8;k++,l++){
                        if(chessboard[k][l]=='K')
                            return true;
                        if(chessboard[k][l]=='B'||
                          chessboard[k][l]=='R'||
                          chessboard[k][l]=='N'||
                          chessboard[k][l]=='P')
                            break;
                    }
                    for(int k=i,l=j;k>=0&&l>=0;k--,l--){
                        if(chessboard[k][l]=='K')
                            return true;
                        if(chessboard[k][l]=='B'||
                          chessboard[k][l]=='R'||
                          chessboard[k][l]=='N'||
                          chessboard[k][l]=='P')
                            break;
                    }
                    for(int k=i; k<8;k++){
                        if(chessboard[k][j]=='K')
                            return true;
                        if(chessboard[k][j]=='R'||
                          chessboard[k][j]=='B'||
                          chessboard[k][j]=='N'||
                          chessboard[k][j]=='P')
                            break;
                    }
                    for(int k=j; k<8;k++){
                        if(chessboard[i][k]=='K')
                            return true;
                        if(chessboard[i][k]=='R'||
                          chessboard[i][k]=='B'||
                          chessboard[i][k]=='N'||
                          chessboard[i][k]=='P')
                            break;
                    }
                    for(int k=i; k>=0;k--){
                        if(chessboard[k][j]=='K')
                            return true;
                        if(chessboard[k][j]=='R'||
                          chessboard[k][j]=='B'||
                          chessboard[k][j]=='N'||
                          chessboard[k][j]=='P')
                            break;
                    }
                    for(int k=j; k>=0;k--){
                        if(chessboard[i][k]=='K')
                            return true;
                        if(chessboard[i][k]=='R'||
                          chessboard[i][k]=='B'||
                          chessboard[i][k]=='N'||
                          chessboard[i][k]=='P')
                            break;
                    }
                    break;
                }
            }
        }
        return false;
    }
}

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int rowSize = matrix.size();
        int colSize = matrix[0].size();
        int total = rowSize * colSize;
        cout<<rowSize<<" "<<colSize<<endl;
        int topLeft = 0, topRight = rowSize, bottomRight = rowSize, bottomLeft = 0;
        int i = 0, j = 0;
        int rightWall = colSize,bottomWall = rowSize, leftWall = -1, topWall = -1;
        vector<int> result;
        int flag = -1;
        while(j<rightWall){
            while(j<rightWall){
                cout<<matrix[i][j]<<endl;
                result.push_back(matrix[i][j]);
                if(result.size()==total) return result;
                j++;
            }
            topWall++;
            j--;
            i++;
            cout<<endl;
            cout<<"after right wall while loop increasing topwall decreasing j and increasing i"<<endl;
            cout<<"i= "<<i<<", j="<<j<<endl;
            cout<<"rightWall= "<<rightWall<<", leftWall="<<leftWall<<endl;
            cout<<"bottomWall= "<<bottomWall<<", topWall="<<topWall<<endl;
            
            
            while(i<bottomWall){
                cout<<matrix[i][j]<<endl;
                result.push_back(matrix[i][j]);
                if(result.size()==total) return result;
                i++;
            }
            rightWall--;
            i--;
            j--;
            cout<<endl;
            
                        cout<<"after right wall while loop increasing topwall decreasing j and increasing i"<<endl;
            cout<<"i= "<<i<<", j="<<j<<endl;
            cout<<"rightWall= "<<rightWall<<", leftWall="<<leftWall<<endl;
            cout<<"bottomWall= "<<bottomWall<<", topWall="<<topWall<<endl;
            
            
            while(j>leftWall){
                cout<<matrix[i][j]<<endl;
                result.push_back(matrix[i][j]);
                if(result.size()==total) return result;
                j--;
            }
            bottomWall--;
            j++;
            i--;
            cout<<endl;
            
                        cout<<"after right wall while loop increasing topwall decreasing j and increasing i"<<endl;
            cout<<"i= "<<i<<", j="<<j<<endl;
            cout<<"rightWall= "<<rightWall<<", leftWall="<<leftWall<<endl;
            cout<<"bottomWall= "<<bottomWall<<", topWall="<<topWall<<endl;
            
            
            
            while(i>topWall){
                cout<<matrix[i][j]<<endl;
                result.push_back(matrix[i][j]);
                if(result.size()==total) return result;
                i--;
            }
            leftWall++;
            i++;
            j++;
            cout<<"i= "<<i<<", j="<<j<<endl;
            cout<<"rightWall= "<<rightWall<<", leftWall="<<leftWall<<endl;
            cout<<"bottomWall= "<<bottomWall<<", topWall="<<topWall<<endl;
        }
        return result;
    }
};
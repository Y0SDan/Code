//exceptions
#include <iostream>

using namespace std;

int main(){
    try
    {
        throw 20;
    }

    catch (int e)
    {
        cout << "Una excepción ocurrió. Número: " << e << endl;
    }

    return 0;
}
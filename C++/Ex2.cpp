//excepciones estandar
#include <iostream>
#include <exception>

using namespace std;

class myexception: public exception
{
    virtual const char* what() const throw()
    {
        return "Mi exception se ejecutó";
    }
} myex;

int main(){
    try
    {
        throw myex;
    }
    catch(exception& e)
    {
        cerr << e.what() << '\n';
    }
    return 0;
}
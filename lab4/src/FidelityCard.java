public class FidelityCard {
    private String _name;
    private String _identificationNumber;
    private int _points = 0;

    public String get_identificationNumber() {
        return _identificationNumber;
    }

    public void set_identificationNumber(String _identificationNumber) {
        this._identificationNumber = _identificationNumber;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public int get_points() {
        return _points;
    }

    public void set_points(int _points) {
        this._points = _points;
    }

    public void pointsAccumulation(float sum){
        if(sum <= 50) {
            _points += 1;
        }
        else
        if(sum <= 100)
            _points += 5;
        else
        if(sum <= 250)
            _points += 10;
        else
        if(sum >= 1000)
            _points += 25;
    }


}
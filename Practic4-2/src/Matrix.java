public class Matrix {
    private int _rows, _cols;
    private double[][] _values;
    public Matrix(int n, int m)
    {
        _cols = m;
        _rows = n;
        _values = new double[n][m];
    }

    public Matrix()
    {
        this(1,1);
        _values = new double[][]{{0.0}};
    }

    public void print()
    {
        for(var col: _values)
        {
            for (var val : col)
            {
                System.out.printf("%6.2f", val);
            }
            System.out.println();
        }
    }

    public Matrix add(Matrix matrix) throws UnsupportedOperationException
    {
        ensureMatrixAdditionCompability(matrix);
        Matrix addedMatrix = new Matrix(_rows, _cols);
        for(int i = 0; i < _rows; i++)
        {
            for(int j = 0; j < _cols; j++)
            {
                addedMatrix._values[i][j] = this._values[i][j] + matrix._values[i][j];
            }
        }
        return addedMatrix;
    }

    private void ensureMatrixAdditionCompability(Matrix matrix) throws UnsupportedOperationException
    {
        if(this._cols != matrix._cols) throw new UnsupportedOperationException();
        if(this._rows != matrix._rows) throw new UnsupportedOperationException();
    }

    public Matrix mul(double multiplicator)
    {
        Matrix mulMatrix = new Matrix(_rows, _cols);
        for(int i = 0; i < _rows; i++)
        {
            for(int j = 0; j < _cols; j++)
            {
                mulMatrix._values[i][j] = this._values[i][j] * multiplicator;
            }
        }
        return mulMatrix;
    }

    public Matrix mulMatrix(Matrix matrix) throws UnsupportedOperationException
    {
        ensureMatrixMultiplicationCompability(matrix);
        Matrix mulMatrix = new Matrix(_rows, matrix._cols);
        for(int i = 0; i < _rows; i++)
        {
            for(int j = 0; j < matrix._cols; j++)
            {
                double calculatedValue = 0.0;
                for(int k = 0; k < _cols; k++)
                {
                    calculatedValue += _values[i][k] * matrix._values[k][j];
                }
                mulMatrix._values[i][j] = calculatedValue;
            }
        }
        return mulMatrix;
    }

    private void ensureMatrixMultiplicationCompability(Matrix matrix) throws UnsupportedOperationException
    {
        if(_cols != matrix._rows) throw new UnsupportedOperationException();
    }

    public int getColsAmount()
    {
        return _cols;
    }

    public int getRowsAmount()
    {
        return _rows;
    }

    public void setValues(double[][] values)
    {
        _rows = values.length;
        _cols = values[0].length;
        _values = values;
    }
}

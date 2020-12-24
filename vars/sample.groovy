import com.st.pipeline.SourceControl

def call(){
    echo "Executing pipeline: Checkout"
    body()
    SourceControl src = new SourceControl()
    src.checkout()

}
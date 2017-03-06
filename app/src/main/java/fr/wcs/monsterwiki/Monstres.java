package fr.wcs.monsterwiki;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by apprenti on 02/03/17.
 */

public class Monstres implements Parcelable {
    private String condition;
    int element;
    private int donneeForce;
    private int donneeLifetime;
    private int donneeStamina;
    private int donneeVitesse;


    public Monstres(String condition, int element, int donneeLifetime, int donneeForce, int donneeVitesse, int donneeStamina) {
        this.condition = condition;
        this.element = element;
        this.donneeForce = donneeForce;
        this.donneeStamina = donneeStamina;
        this.donneeLifetime = donneeLifetime;
        this.donneeVitesse = donneeVitesse;
    }

    protected Monstres(Parcel in) {
        condition = in.readString();
        element = in.readInt();
        donneeForce = in.readInt();
        donneeLifetime = in.readInt();
        donneeStamina = in.readInt();
        donneeVitesse = in.readInt();
    }

    public static final Creator<Monstres> CREATOR = new Creator<Monstres>() {
        @Override
        public Monstres createFromParcel(Parcel in) {
            return new Monstres(in);
        }

        @Override
        public Monstres[] newArray(int size) {
            return new Monstres[size];
        }
    };

    public String toString(){
        String resultat;
        resultat = "-Nom : -"+ condition + "-Type : -" + element + "-Lifetime -" + donneeLifetime + "-Force : -" + donneeForce + "-Vitesse : -" + donneeVitesse + "-Stamina : -" +donneeStamina;
        return resultat;

    }
    public String getCondition (){
        return this.condition;
    }

    public int getDonneeForce() {
        return donneeForce;
    }

    public int getDonneeLifetime() {
        return donneeLifetime;
    }

    public int getDonneeStamina() {
        return donneeStamina;
    }

    public int getDonneeVitesse() {
        return donneeVitesse;
    }

    public int getElement() {
        return element;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(condition);
        dest.writeInt(element);
        dest.writeInt(donneeForce);
        dest.writeInt(donneeLifetime);
        dest.writeInt(donneeStamina);
        dest.writeInt(donneeVitesse);
    }
}
